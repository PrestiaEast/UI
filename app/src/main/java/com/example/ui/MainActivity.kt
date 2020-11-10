package com.example.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_next).setOnClickListener{nextPage()}
        val Fname: EditText = findViewById<EditText>(R.id.first_name) as EditText
        Log.i("firstName", Fname.text.toString())
        val Lname: EditText = findViewById<EditText>(R.id.last_name) as EditText
        Log.i("lastName", Lname.text.toString())
        val Email: EditText = findViewById<EditText>(R.id.email) as EditText
        Log.i("Email", Email.text.toString())
    }

     private fun nextPage(){
        val intent = Intent(this, nextPage::class.java)
        startActivity(intent)
    }


}