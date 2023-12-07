package com.example.loginregisteractivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.R_btn1

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegisterListener()
    }

    private fun btnRegisterListener () {
        R_btn1.setOnClickListener() {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}