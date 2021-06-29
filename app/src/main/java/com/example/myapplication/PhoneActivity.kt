package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class PhoneActivity : AppCompatActivity() {
    private lateinit var phoneNumber : EditText
    private lateinit var dialButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone)

        phoneNumber = findViewById(R.id.phoneNumber)
        dialButton= findViewById(R.id.dialButton)

        dialButton.setOnClickListener {
            val intent : Intent = Intent (Intent.ACTION_DIAL)
            startActivity(intent)
        }

    }



}