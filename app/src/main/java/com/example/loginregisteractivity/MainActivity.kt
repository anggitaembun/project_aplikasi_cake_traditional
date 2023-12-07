package com.example.loginregisteractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnLogin : Button
    private lateinit var btnRegister : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btn_1)
        btnRegister = findViewById(R.id.btn_2)

        btnLogin.setOnClickListener(this)
        btnRegister.setOnClickListener(this)

    }



    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_1 -> {
                val moveLogin = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(moveLogin)
            }
            R.id.btn_2 -> {
                val moveRegis = Intent(this@MainActivity, RegisterActivity::class.java)
                startActivity(moveRegis)
            }
        }
    }
}