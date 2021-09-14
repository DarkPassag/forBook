package com.example.criminalintent.Fragments

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import com.example.criminalintent.Interfaces.TimeSelected
import java.sql.Time
import java.util.*


private const val ARG_TIME = "time"

class TimePickerFragment: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val timeListener =
            TimePickerDialog.OnTimeSetListener { _: TimePicker, hourOfDay: Int, minute: Int ->
                val resultTime: Date = GregorianCalendar(0, 0, 0, hourOfDay, minute).time
                targetFragment?.let {
                    (it as TimeSelected).onTimeSelected(resultTime)
                }
            }
        val calendar = Calendar.getInstance()
//        val time = arguments?.getSerializable(ARG_TIME) as Date
//        calendar.time = time
        val initialHour = calendar.get(Calendar.HOUR_OF_DAY)
        val initialMinute = calendar.get(Calendar.MINUTE)
        return TimePickerDialog(requireContext(),
            timeListener,
            initialHour,
            initialMinute,
            true)
    }

    companion object {
        fun newInstance(): TimePickerFragment {
            return TimePickerFragment()
        }
    }

}