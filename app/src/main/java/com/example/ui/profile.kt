package com.example.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        var intent = intent
        val firstname = intent.getStringExtra("First Name")
        val lastname = intent.getStringExtra("Last Name")
        val emailadd = intent.getStringExtra("Email")
        var value = getIntent().getStringExtra("Age")
        var birthView = getIntent().getStringExtra("Birthday")
        var number = getIntent().getStringExtra("Number")


        val callResult = findViewById<TextView>(R.id.textView2)

        callResult.text =
                "First Name: " + firstname + "\nLast Name: " + lastname +"\nEmail: " +emailadd+ "\nAge: " + value+ "\nBirthday: " +number+"\nPhone Number: "


    }
}

//        val intent = intent
//        val editText = intent.getStringExtra("NameEditText")
//        val last = intent.getStringExtra("Lname")
//        val email = intent.getStringExtra("email")
//        val age = intent.getStringExtra("age")
//
//        //textview
//         findViewById<TextView>(R.id.textView2).apply {
//             text = editText.toString()
//         }
////        findViewById<TextView>(R.id.textView4).apply {
////            text = email.toString()
////        }
//        findViewById<TextView>(R.id.textView4).apply {
//            text = age.toString()
//        }
        //setText
//        resultTv.text = "Name: $editText $last"
//        em.text = "Email: $email"
