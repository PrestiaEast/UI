package com.example.ui

import android.app.DatePickerDialog
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.SeekBar
import android.widget.Switch
import android.widget.TextView
import com.google.android.material.slider.Slider

class nextPage : AppCompatActivity() {

    lateinit var slider: SeekBar
    lateinit var value: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_page)

        slider = findViewById<SeekBar>(R.id.seekBar)
        value = findViewById<TextView>(R.id.displayAge)

        slider.max = 60
        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                value.text = "Select Age: " + progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                value.text = " " + seekBar.progress
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                value.text = "Age : " + seekBar.progress
            }
        })


        val mPickTimeBtn = findViewById<Button>(R.id.birth)
        val textView = findViewById<TextView>(R.id.birthDate)

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)


        mPickTimeBtn.setOnClickListener {

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                textView.text = "$dayOfMonth $month, $year"
            }, year, month, day)
            dpd.show()

        }

        val ViewGroup = findViewById<Switch>(R.id.switchNum)
        val numberFormatException = findViewById<TextView>(R.id.number)

        ViewGroup.setOnClickListener{
            numberFormatException.visibility = if (ViewGroup.visibility == View.INVISIBLE){
                View.VISIBLE
            } else {
                View.VISIBLE
            }
        }





    }



}