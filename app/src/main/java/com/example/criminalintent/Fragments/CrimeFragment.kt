package com.example.criminalintent.Fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import java.util.*
import androidx.lifecycle.Observer
import com.example.criminalintent.Crime
import com.example.criminalintent.ViewModels.CrimeDetailViewModel
import com.example.criminalintent.Interfaces.DateSelected
import com.example.criminalintent.Interfaces.TimeSelected
import com.example.criminalintent.R


private const val ARG_CRIME_ID = "crime_id"
private const val DIALOG_DATE = "DialogDate"
private const val REQUEST_DATE = 0

private val TAG = "CrimeFragment"
class CrimeFragment: Fragment(), DateSelected, TimeSelected {
    private lateinit var crime: Crime
    private lateinit var titleField :EditText
    private lateinit var dateButton: Button
    private lateinit var solvedCheckBox: CheckBox

    private val crimeDetailViewModel: CrimeDetailViewModel by lazy {
        ViewModelProvider(this).get(CrimeDetailViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        crime = Crime()


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_crime, container, false)
        titleField = view.findViewById(R.id.crime_title) as EditText
        dateButton = view.findViewById(R.id.crime_date) as Button
        solvedCheckBox = view.findViewById(R.id.crime_sloved) as CheckBox
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        crimeDetailViewModel.crimeLiveData.observe(
            viewLifecycleOwner, Observer
             {
                crime -> crime?.let { crime
                    this.crime = crime
                    updateUI()
            }
            }
        )
    }

    override fun onStart() {
        super.onStart()
        val titleWatcher = object : TextWatcher
        {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {


            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                crime.title = s.toString()
            }

            override fun afterTextChanged(s: Editable?) {

            }
        }
        titleField.addTextChangedListener(titleWatcher)
        solvedCheckBox.apply {
            setOnCheckedChangeListener{_, isChecked -> crime.isSolved = isChecked}
        }

        dateButton.setOnClickListener {
           DatePickerFragment.newInstance(crime.date).apply {
               setTargetFragment(this@CrimeFragment, REQUEST_DATE)
               show(this@CrimeFragment.parentFragmentManager, DIALOG_DATE)
           }
        }


    }

    private fun updateUI(){
        titleField.setText(crime.title)
        dateButton.text = crime.date.toString()
        solvedCheckBox.apply {
            isChecked = crime.isSolved
            jumpDrawablesToCurrentState()
        }
    }

    companion object {
        fun newInstance(crimeID: UUID):
                CrimeFragment {
            val args = Bundle().apply {
                putSerializable(ARG_CRIME_ID, crimeID)
            }
            return CrimeFragment().apply {
                arguments = args
            }
        }


        fun newInstanceWithoutArgs(): CrimeFragment {
            return CrimeFragment()
        }
    }



    override fun onStop() {
        super.onStop()

        crimeDetailViewModel.saveCrime(crime)
    }

    override fun onDateSelected(date: Date) {
        crime.date = date
        updateUI()
    }

    override fun onTimeSelected(time: Date) {
        val times = crime.date.time
        val timesTimes = time.time
        val ti =  times + timesTimes
        crime.date = Date(ti)
        updateUI()
    }
}


