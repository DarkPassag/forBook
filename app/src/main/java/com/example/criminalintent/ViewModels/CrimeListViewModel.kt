package com.example.criminalintent.ViewModels

import androidx.lifecycle.ViewModel
import com.example.criminalintent.Crime
import com.example.criminalintent.CrimeRepository

class CrimeListViewModel : ViewModel() {

    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()

    fun addCrime(crime: Crime) {
        crimeRepository.addCrime(crime)
    }
}