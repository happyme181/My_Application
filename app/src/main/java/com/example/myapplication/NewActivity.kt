package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class NewActivity : AppCompatActivity() {
    private lateinit var continueButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        continueButton = findViewById(R.id.continueButton)

        continueButton.setOnClickListener {
            val intent = Intent (this, PhoneActivity::class.java)
            startActivity(intent)
        }
    }
}