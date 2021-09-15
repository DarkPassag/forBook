package com.example.criminalintent.ViewModels

import androidx.lifecycle.ViewModel
import com.example.criminalintent.Crime
import com.example.criminalintent.CrimeRepositoriy

class CrimeListViewModel: ViewModel() {
    private val CrimeRepositoriy =com.example.criminalintent.CrimeRepositoriy.get()
    val crimeListLiveData = CrimeRepositoriy.getCrimes()
    fun addCrime(crime: Crime){
        CrimeRepositoriy.addCrime(crime)
    }
}