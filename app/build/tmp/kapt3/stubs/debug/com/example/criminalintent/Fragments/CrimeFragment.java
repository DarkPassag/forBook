package com.example.criminalintent.Fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \'2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\b\u0010!\u001a\u00020\u0014H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001fH\u0016J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010&\u001a\u00020\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/criminalintent/Fragments/CrimeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/criminalintent/Interfaces/DateSelected;", "Lcom/example/criminalintent/Interfaces/TimeSelected;", "()V", "crime", "Lcom/example/criminalintent/Crime;", "crimeDetailViewModel", "Lcom/example/criminalintent/ViewModels/CrimeDetailViewModel;", "getCrimeDetailViewModel", "()Lcom/example/criminalintent/ViewModels/CrimeDetailViewModel;", "crimeDetailViewModel$delegate", "Lkotlin/Lazy;", "dateButton", "Landroid/widget/Button;", "solvedCheckBox", "Landroid/widget/CheckBox;", "titleField", "Landroid/widget/EditText;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDateSelected", "date", "Ljava/util/Date;", "onStart", "onStop", "onTimeSelected", "time", "onViewCreated", "view", "updateUI", "Companion", "app_debug"})
public final class CrimeFragment extends androidx.fragment.app.Fragment implements com.example.criminalintent.Interfaces.DateSelected, com.example.criminalintent.Interfaces.TimeSelected {
    private com.example.criminalintent.Crime crime;
    private android.widget.EditText titleField;
    private android.widget.Button dateButton;
    private android.widget.CheckBox solvedCheckBox;
    private final kotlin.Lazy crimeDetailViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.criminalintent.Fragments.CrimeFragment.Companion Companion = null;
    
    public CrimeFragment() {
        super();
    }
    
    private final com.example.criminalintent.ViewModels.CrimeDetailViewModel getCrimeDetailViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void updateUI() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDateSelected(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
    }
    
    @java.lang.Override()
    public void onTimeSelected(@org.jetbrains.annotations.NotNull()
    java.util.Date time) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\b"}, d2 = {"Lcom/example/criminalintent/Fragments/CrimeFragment$Companion;", "", "()V", "newInstance", "Lcom/example/criminalintent/Fragments/CrimeFragment;", "crimeID", "Ljava/util/UUID;", "newInstanceWithoutArgs", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.criminalintent.Fragments.CrimeFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.util.UUID crimeID) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.criminalintent.Fragments.CrimeFragment newInstanceWithoutArgs() {
            return null;
        }
    }
}