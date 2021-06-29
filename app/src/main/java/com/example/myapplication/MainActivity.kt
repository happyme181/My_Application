package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var signUpButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUpButton = findViewById(R.id.signUpButton)

        signUpButton.setOnClickListener {
            val intent = Intent (this, SignActivity::class.java)
            startActivity(intent)
        }

    }


}