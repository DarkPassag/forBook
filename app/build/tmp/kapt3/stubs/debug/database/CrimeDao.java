package database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u0007H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Ldatabase/CrimeDao;", "", "addCrime", "", "crime", "Lcom/example/criminalintent/Crime;", "getCrime", "Landroidx/lifecycle/LiveData;", "id", "Ljava/util/UUID;", "getCrimes", "", "updateCrime", "app_debug"})
public abstract interface CrimeDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from crime")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.criminalintent.Crime>> getCrimes();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM crime WHERE id=(:id)")
    public abstract androidx.lifecycle.LiveData<com.example.criminalintent.Crime> getCrime(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
    
    @androidx.room.Update()
    public abstract void updateCrime(@org.jetbrains.annotations.NotNull()
    com.example.criminalintent.Crime crime);
    
    @androidx.room.Insert()
    public abstract void addCrime(@org.jetbrains.annotations.NotNull()
    com.example.criminalintent.Crime crime);
}