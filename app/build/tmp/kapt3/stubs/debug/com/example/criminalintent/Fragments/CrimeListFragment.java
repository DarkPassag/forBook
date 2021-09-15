package com.example.criminalintent.Fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0004 !\"#B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0016\u0010\u001f\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/criminalintent/Fragments/CrimeListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "callbacks", "Lcom/example/criminalintent/Interfaces/Callbacks;", "crimeListViewModel", "Lcom/example/criminalintent/ViewModels/CrimeListViewModel;", "getCrimeListViewModel", "()Lcom/example/criminalintent/ViewModels/CrimeListViewModel;", "crimeListViewModel$delegate", "Lkotlin/Lazy;", "crimeRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "crimes", "", "Lcom/example/criminalintent/Crime;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onViewCreated", "view", "updateUI", "Companion", "CrimeAdapter", "CrimeHolder", "DiffCallback", "app_debug"})
public final class CrimeListFragment extends androidx.fragment.app.Fragment {
    private java.util.List<com.example.criminalintent.Crime> crimes;
    private com.example.criminalintent.Interfaces.Callbacks callbacks;
    private androidx.recyclerview.widget.RecyclerView crimeRecyclerView;
    private final kotlin.Lazy crimeListViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.criminalintent.Fragments.CrimeListFragment.Companion Companion = null;
    
    public CrimeListFragment() {
        super();
    }
    
    private final com.example.criminalintent.ViewModels.CrimeListViewModel getCrimeListViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
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
    public void onDetach() {
    }
    
    private final void updateUI(java.util.List<com.example.criminalintent.Crime> crimes) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/criminalintent/Fragments/CrimeListFragment$CrimeHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lcom/example/criminalintent/Fragments/CrimeListFragment;Landroid/view/View;)V", "crime", "Lcom/example/criminalintent/Crime;", "dataTextView", "Landroid/widget/TextView;", "getDataTextView", "()Landroid/widget/TextView;", "solvedImageView", "Landroid/widget/ImageView;", "getSolvedImageView", "()Landroid/widget/ImageView;", "titleTextView", "getTitleTextView", "bind", "", "onClick", "v", "app_debug"})
    final class CrimeHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private com.example.criminalintent.Crime crime;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView dataTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView solvedImageView = null;
        
        public CrimeHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitleTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDataTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getSolvedImageView() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.criminalintent.Crime crime) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u0003R\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/criminalintent/Fragments/CrimeListFragment$CrimeAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/criminalintent/Crime;", "Lcom/example/criminalintent/Fragments/CrimeListFragment$CrimeHolder;", "Lcom/example/criminalintent/Fragments/CrimeListFragment;", "(Lcom/example/criminalintent/Fragments/CrimeListFragment;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
    final class CrimeAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.criminalintent.Crime, com.example.criminalintent.Fragments.CrimeListFragment.CrimeHolder> {
        
        public CrimeAdapter() {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.criminalintent.Fragments.CrimeListFragment.CrimeHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.criminalintent.Fragments.CrimeListFragment.CrimeHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/criminalintent/Fragments/CrimeListFragment$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/criminalintent/Crime;", "(Lcom/example/criminalintent/Fragments/CrimeListFragment;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.criminalintent.Crime> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.criminalintent.Crime oldItem, @org.jetbrains.annotations.NotNull()
        com.example.criminalintent.Crime newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.criminalintent.Crime oldItem, @org.jetbrains.annotations.NotNull()
        com.example.criminalintent.Crime newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/criminalintent/Fragments/CrimeListFragment$Companion;", "", "()V", "newInstanse", "Lcom/example/criminalintent/Fragments/CrimeListFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.criminalintent.Fragments.CrimeListFragment newInstanse() {
            return null;
        }
    }
}