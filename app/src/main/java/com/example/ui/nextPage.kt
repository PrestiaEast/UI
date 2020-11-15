package com.example.ui

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class nextPage : AppCompatActivity() {

    lateinit var slider: SeekBar
    lateinit var value: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_page)

        val button = findViewById<Button>(R.id.finish)

        slider = findViewById<SeekBar>(R.id.seekBar)
        value = findViewById<TextView>(R.id.displayAge)

        slider.max = 60
        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                value.text = "" + progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                value.text = " " + seekBar.progress
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                value.text = "" + seekBar.progress
            }
        })


        val mPickTimeBtn = findViewById<Button>(R.id.birth)
        val birthView = findViewById<TextView>(R.id.birthDate)

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)


        mPickTimeBtn.setOnClickListener {

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                birthView.text = "$dayOfMonth $month, $year"
            }, year, month, day)
            dpd.show()

        }


        val ViewGroup = findViewById<Switch>(R.id.switchNum)
        val number = findViewById<EditText>(R.id.number)

        ViewGroup.setOnClickListener {
            number.visibility = if (ViewGroup.visibility == View.INVISIBLE) {
                View.VISIBLE
            } else {
                View.VISIBLE
            }
        }


        button.setOnClickListener {
            var firstname = getIntent().getStringExtra("First Name")
            var lastname = getIntent().getStringExtra("Last Name")
            var emailadd = getIntent().getStringExtra("Email")
            var getAge = value.text.toString()
            var bday = birthView.text.toString()
            var contactNum = number.text.toString()

            val intent = Intent(this, profile::class.java)
            intent.putExtra("First Name", firstname)
            intent.putExtra("Last Name", lastname)
            intent.putExtra("Email", emailadd)
            intent.putExtra("Age", getAge)
            intent.putExtra("Birthday", bday)
            intent.putExtra("Phone Number", contactNum)

            startActivity(intent)

        }


    }
}