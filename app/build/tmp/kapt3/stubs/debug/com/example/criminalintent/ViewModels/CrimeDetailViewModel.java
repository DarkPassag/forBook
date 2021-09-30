package com.example.criminalintent.ViewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/criminalintent/ViewModels/CrimeDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "crimeIdLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/UUID;", "crimeLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/criminalintent/Crime;", "getCrimeLiveData", "()Landroidx/lifecycle/LiveData;", "crimeRepository", "Lcom/example/criminalintent/CrimeRepository;", "getPhotoFile", "Ljava/io/File;", "crime", "loadCrime", "", "crimeId", "saveCrime", "app_debug"})
public final class CrimeDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.criminalintent.CrimeRepository crimeRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.UUID> crimeIdLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.criminalintent.Crime> crimeLiveData = null;
    
    public CrimeDetailViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.criminalintent.Crime> getCrimeLiveData() {
        return null;
    }
    
    public final void loadCrime(@org.jetbrains.annotations.NotNull()
    java.util.UUID crimeId) {
    }
    
    public final void saveCrime(@org.jetbrains.annotations.NotNull()
    com.example.criminalintent.Crime crime) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getPhotoFile(@org.jetbrains.annotations.NotNull()
    com.example.criminalintent.Crime crime) {
        return null;
    }
}