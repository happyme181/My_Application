package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignActivity : AppCompatActivity() {

    private lateinit var firstnameInput: EditText
    private lateinit var lastnameInput: EditText
    private lateinit var numberInput: EditText
    private lateinit var emailInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var registerButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        firstnameInput = findViewById(R.id.firstnameInput)
        lastnameInput = findViewById(R.id.lastnameInput)
        numberInput = findViewById(R.id.numberInput)
        emailInput = findViewById(R.id.emailInput)
        passwordInput = findViewById(R.id.passwordInput)
        registerButton = findViewById(R.id.registerButton)

        registerButton.setOnClickListener {
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)

        }

    }



}