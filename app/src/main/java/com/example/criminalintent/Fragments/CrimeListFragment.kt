package com.example.criminalintent.Fragments


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.criminalintent.Crime
import com.example.criminalintent.ViewModels.CrimeListViewModel
import com.example.criminalintent.Interfaces.Callbacks
import com.example.criminalintent.R


private const val TAG = "CrimeListFragment"

class CrimeListFragment: Fragment() {


    private var crimes: List<Crime> = listOf()
    private var callbacks: Callbacks? = null
    private lateinit var crimeRecyclerView: RecyclerView
    private val crimeListViewModel: CrimeListViewModel by lazy {
        ViewModelProvider(this).get(CrimeListViewModel::class.java)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        callbacks  = context as Callbacks?
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_crime_list, container, false)
        crimeRecyclerView = view.findViewById(R.id.crime_recycle_view) as RecyclerView
        crimeRecyclerView.layoutManager = LinearLayoutManager(context)
        crimeRecyclerView.adapter = CrimeAdapter()

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        crimeListViewModel.crimeListLiveData.observe(viewLifecycleOwner, Observer
        { it ->it.let {
            crimes = it
            if(crimes.isEmpty()){
               val buttonNewCrime = view.findViewById<Button>(R.id.newCrime)
                val textView = view.findViewById<TextView>(R.id.EmptyText)
                textView.visibility = View.VISIBLE
                buttonNewCrime.visibility = View.VISIBLE

            }
            val buttonNewCrime = view.findViewById<Button>(R.id.newCrime)
            buttonNewCrime.setOnClickListener {
                val crime = Crime()
                crimeListViewModel.addCrime(crime)
                callbacks?.onCrimeSelected(crime.id)
                callbacks?.newCrime()
            }
            Log.i(TAG, "Got crimes ${crimes.size}")
            updateUI(crimes)} })
    }

    override fun onDetach() {
        super.onDetach()
        callbacks = null
    }

    private fun updateUI(crimes: List<Crime>){
        (crimeRecyclerView.adapter as CrimeAdapter).submitList(crimes)
    }
    private inner class CrimeHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener{
        private lateinit var crime:Crime
        val titleTextView: TextView = itemView.findViewById(R.id.crime_title)
        val dataTextView: TextView = itemView.findViewById(R.id.crime_date)
        val solvedImageView: ImageView = itemView.findViewById(R.id.crime_solved)

        init {
            itemView.setOnClickListener(this)

        }
        fun bind(crime: Crime){
            this.crime = crime
            titleTextView.text = this.crime.title
            dataTextView.text = this.crime.date.toString()
            solvedImageView.visibility = if(crime.isSolved) {View.VISIBLE}
            else {View.GONE}
        }

        override fun onClick(v: View) {

            callbacks?.onCrimeSelected(crime.id)

        }




    }
    private inner class CrimeAdapter:
        ListAdapter<Crime, CrimeHolder>(DiffCallback()) {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
                CrimeHolder {
            val view = layoutInflater.inflate(R.layout.list_item_crime, parent, false)
            return CrimeHolder(view)
        }

        override fun onBindViewHolder(holder: CrimeHolder, position: Int) {
            Log.d("Tag", "Position refresh: $position")
            holder.bind(getItem(position))

        }

        override fun getItemCount() = crimes.size



    }



    companion object {
        fun newInstanse():
                CrimeListFragment{
            return CrimeListFragment()
        }
    }

    private inner class DiffCallback: DiffUtil.ItemCallback<Crime>() {
        override fun areItemsTheSame(oldItem: Crime, newItem: Crime): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Crime, newItem: Crime): Boolean {
            return oldItem == newItem
        }


    }



}

