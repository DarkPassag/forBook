package com.example.criminalintent

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import database.CrimeDatabase
import java.lang.IllegalStateException
import java.util.*
import java.util.concurrent.Executors

private const val DATABASE_NAME = "crime-database.db"

class CrimeRepositoriy private constructor(context: Context){
    private val database: CrimeDatabase = Room
        .databaseBuilder(context.applicationContext,
        CrimeDatabase::class.java,
        DATABASE_NAME)
        .createFromAsset("crime-database.db")
        .build()
    private val crimeDao = database.crimeDao()
    private val executor = Executors.newSingleThreadExecutor()

    fun getCrimes(): LiveData<List<Crime>> = crimeDao.getCrimes()

    fun getCrime(id: UUID): LiveData<Crime?> = crimeDao.getCrime(id)

    fun updateCrime(crime: Crime){
        executor.execute{
            crimeDao.updateCrime(crime)
        }

        fun addCrime(crime: Crime){
            executor.execute {
                crimeDao.addCrime(crime)
            }
        }
    }


    companion object{
        private var INSTANCE: CrimeRepositoriy? = null

        fun initialize(context: Context){
            if(INSTANCE == null){
                INSTANCE = CrimeRepositoriy(context)
            }
        }
        fun get(): CrimeRepositoriy{
            return INSTANCE?: throw IllegalStateException("CrimeRepository must be initialize")
        }
    }
}