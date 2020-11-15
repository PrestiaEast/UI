package com.example.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstName = findViewById<EditText>(R.id.first_name)
        val lastName = findViewById<EditText>(R.id.last_name)
        val emailAdd = findViewById<EditText>(R.id.email)
        val button1 = findViewById<Button>(R.id.btn_next)


        button1.setOnClickListener {

            var firstname = firstName.text.toString()
            var lastname = lastName.text.toString()
            var emailadd = emailAdd.text.toString()

            val intent = Intent(this@MainActivity, nextPage::class.java)
            intent.putExtra("First Name", firstname)
            intent.putExtra("Last Name", lastname)
            intent.putExtra("Email", emailadd)
            startActivity(intent)

        }

    }

}


