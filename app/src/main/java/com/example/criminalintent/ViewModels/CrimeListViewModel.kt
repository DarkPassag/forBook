package com.example.criminalintent.ViewModels

import androidx.lifecycle.ViewModel

class CrimeListViewModel: ViewModel() {
    private val CrimeRepositoriy = com.example.criminalintent.CrimeRepositoriy.get()
    val crimeListLiveData = CrimeRepositoriy.getCrimes()
}