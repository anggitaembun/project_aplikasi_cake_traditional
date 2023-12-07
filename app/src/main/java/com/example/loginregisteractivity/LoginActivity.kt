package com.example.loginregisteractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.txt_register

class LoginActivity : AppCompatActivity() {
    private lateinit var button_login : Button
    private lateinit var textRegister : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button_login= findViewById((R.id.L_btn1))
        textRegister= findViewById(R.id.txt_register)

        button_login.setOnClickListener{
            val move = Intent(this@LoginActivity, HalamanUtama::class.java)
            startActivity(move)
        }

        textRegister.setOnClickListener{
            val move = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(move)
        }

        //txtRegisterListener()
    }
//    private fun txtRegisterListener() {
//        val txt_register = null
//        txt_register.setOnClickListener {
//            startActivity(Intent(this, RegisterActivity::class.java))
//        }
//    }




}


