package com.example.criminalintent.Fragments

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.text.Editable
import android.text.TextWatcher
import android.text.format.DateFormat
import android.util.Log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import java.util.*
import androidx.lifecycle.Observer
import com.example.criminalintent.Crime
import com.example.criminalintent.ViewModels.CrimeDetailViewModel
import com.example.criminalintent.Interfaces.DateSelected
import com.example.criminalintent.Interfaces.TimeSelected
import com.example.criminalintent.R
import java.io.File
import java.net.URI


private const val TAG = "CrimeFragment"
private const val ARG_CRIME_ID = "crime_id"
private const val DIALOG_DATE = "DialogDate"
private const val REQUEST_DATE = 0
private const val REQUEST_CONTACT = 1
private const val REQUEST_PHONE = 2
private const val REQUEST_PHOTO = 3
private const val DATE_FORMAT = "EEE, MM, dd"

class CrimeFragment : Fragment(), DatePickerFragment.Callbacks {

    private lateinit var crime : Crime
    private lateinit var titleField : EditText
    private lateinit var dateButton : Button
    private lateinit var solvedCheckBox : CheckBox
    private lateinit var sendCrimeReport: Button
    private lateinit var suspectButton: Button
    private lateinit var callButton: Button
    private lateinit var imageCrime: ImageView
    private lateinit var imageButton: ImageButton
    private lateinit var photoFile: File
    private lateinit var photoUri : Uri

    private val crimeDetailViewModel : CrimeDetailViewModel by lazy {
        ViewModelProvider(this).get(CrimeDetailViewModel::class.java)
    }

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        crime = Crime()
        val crimeId : UUID = arguments?.getSerializable(ARG_CRIME_ID) as UUID
        crimeDetailViewModel.loadCrime(crimeId)
    }


    override fun onCreateView(
        inflater : LayoutInflater,
        container : ViewGroup?,
        savedInstanceState : Bundle?
    ) : View? {
        val view = inflater.inflate(R.layout.fragment_crime, container, false)
        sendCrimeReport = view.findViewById<Button>(R.id.sendSuspect)
        suspectButton = view.findViewById(R.id.chooseSuspect)
        titleField = view.findViewById(R.id.crime_title) as EditText
        dateButton = view.findViewById(R.id.crime_date) as Button
        solvedCheckBox = view.findViewById(R.id.crime_sloved) as CheckBox
        callButton = view.findViewById(R.id.callCrimer)
        imageButton = view.findViewById(R.id.crimeCamera)
        imageCrime = view.findViewById(R.id.crimePhoto)


        return view
    }

    override fun onViewCreated(view : View, savedInstanceState : Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val crimeId = arguments?.getSerializable(ARG_CRIME_ID) as UUID
        crimeDetailViewModel.loadCrime(crimeId)
        crimeDetailViewModel.crimeLiveData.observe(
            viewLifecycleOwner,
            Observer { crime ->
                crime?.let {
                    this.crime = crime
                    photoFile = crimeDetailViewModel.getPhotoFile(crime)
                    photoUri = FileProvider.getUriForFile(requireActivity(),"com.example.criminalintent.fileprovider", photoFile)
                    updateUI()
                }
            })

        val appCompatActivity = activity as AppCompatActivity
        appCompatActivity.supportActionBar?.setTitle(R.string.addNewCrime)
    }

    override fun onStart() {
        super.onStart()



        val titleWatcher = object : TextWatcher {

            override fun beforeTextChanged(
                sequence : CharSequence?,
                start : Int,
                count : Int,
                after : Int
            ) {
                // This space intentionally left blank
            }

            override fun onTextChanged(
                sequence : CharSequence?,
                start : Int,
                before : Int,
                count : Int
            ) {
                crime.title = sequence.toString()
            }

            override fun afterTextChanged(sequence : Editable?) {
                // This one too
            }
        }
        titleField.addTextChangedListener(titleWatcher)

        solvedCheckBox.apply {
            setOnCheckedChangeListener { _, isChecked ->
                crime.isSolved = isChecked
            }
        }

        dateButton.setOnClickListener {
            DatePickerFragment.newInstance(crime.date).apply {
                setTargetFragment(this@CrimeFragment, REQUEST_DATE)
                show(this@CrimeFragment.requireFragmentManager(), DIALOG_DATE)
            }
        }

        sendCrimeReport.setOnClickListener {
            Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, getCrimeReport())
                putExtra(Intent.EXTRA_SUBJECT, getString(R.string.crimeReportSuspect))
            }.also {
                val chooserIntent = Intent.createChooser(it,
                        getString(R.string.send_report))
                startActivity(chooserIntent)
            }
        }

        suspectButton.apply {
            val pickContactIntent = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)

            setOnClickListener{
                startActivityForResult(pickContactIntent, REQUEST_CONTACT)
            }
            val packageManadger: PackageManager = requireActivity().packageManager
            val resolvedActivity: ResolveInfo? = packageManadger.resolveActivity(pickContactIntent,
                PackageManager.MATCH_DEFAULT_ONLY)

            if(resolvedActivity == null){
                isEnabled = false
            }

        }

        callButton.apply {
            val pickContactIntent = Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI)

            val callIntent = Intent(Intent.ACTION_DIAL, Uri.parse(this.text.toString()))

            setOnClickListener {
                if(callButton.text.contains("8") ){
                    Log.d("TAG", callButton.text.toString())
                startActivity(callIntent)
            }
                else startActivityForResult(pickContactIntent, REQUEST_PHONE )

            }
        }

        imageButton.apply {
            val packageManager: PackageManager = requireActivity().packageManager
            val captureImage = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            val resolvedActivity: ResolveInfo? = packageManager.resolveActivity(captureImage, PackageManager.MATCH_DEFAULT_ONLY)
            if(resolvedActivity == null){
                isEnabled = false
            }
            setOnClickListener{
                captureImage.putExtra(MediaStore.EXTRA_OUTPUT, photoUri)
                val cameraActivities : List<ResolveInfo> = packageManager.queryIntentActivities(captureImage,PackageManager.MATCH_DEFAULT_ONLY)
                for(cameraActivity in cameraActivities){
                    requireActivity().grantUriPermission(cameraActivity.activityInfo.packageName, photoUri, Intent.FLAG_GRANT_WRITE_URI_PERMISSION)
                }
                startActivityForResult(captureImage, REQUEST_PHOTO)
            }
        }



    }

    override fun onStop() {
        super.onStop()
        crimeDetailViewModel.saveCrime(crime)
    }

    override fun onDateSelected(date : Date) {
        crime.date = date
        updateUI()
    }

    override fun onActivityResult(requestCode : Int, resultCode : Int, data : Intent?) {
        when{
            resultCode != Activity.RESULT_OK -> return
            requestCode == REQUEST_CONTACT && data != null ->{
                val contactUri: Uri? = data.data
                        // Указываем для каких полей запрос должен возвращать значение
                val queryFields = arrayOf(ContactsContract.Contacts.DISPLAY_NAME)
                // выполняемый запрос contactUri похож на запрос where
                val cursor =requireActivity().contentResolver.query(contactUri!!,
                    queryFields, null, null, null)
                cursor?.use {
                    if(it.count ==0){
                        return
                    }
                    it.moveToFirst()
                    val suspect = it.getString(0)
                    crime.suspect = suspect
                    crimeDetailViewModel.saveCrime(crime)
                    suspectButton.text = suspect
                }

            }

            requestCode == REQUEST_PHONE && data != null ->{
                val contactUri: Uri? = data.data
                val queryFields = arrayOf(ContactsContract.CommonDataKinds.Phone.NUMBER)
                val cursor = requireActivity().contentResolver.query(contactUri!!, queryFields, null,null,null)
                cursor?.use {
                    if(it.count == 0){
                        return
                    }
                    it.moveToFirst()
                    val suspect = it.getString(0)
                    crime.suspect = suspect
                    crimeDetailViewModel.saveCrime(crime)
                    callButton.text = suspect
                }
            }

        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    private fun updateUI() {
        titleField.setText(crime.title)
        dateButton.text = crime.date.toString()
        solvedCheckBox.isChecked = crime.isSolved
        if(crime.suspect.isNotEmpty()){
            suspectButton.text = crime.suspect
        }
    }

    private fun getCrimeReport(): String{

        val solvedString = if(crime.isSolved){
            getString(R.string.crimeReportSolved)
        }
        else{
            getString(R.string.crimeReportUnsolved)
        }

        val dateString = DateFormat.format(DATE_FORMAT, crime.date).toString()

        val suspect = if(crime.suspect.isBlank()){
            getString(R.string.crime_report_no_suspect)
        }
        else getString(R.string.crimeReportSuspect)

        return getString(R.string.crimeReport, crime.title, dateString, solvedString, suspect)

    }

    companion object {

        fun newInstance(crimeId : UUID) : CrimeFragment {
            val args = Bundle().apply {
                putSerializable(ARG_CRIME_ID, crimeId)
            }
            return CrimeFragment().apply {
                arguments = args
            }
        }
    }
}