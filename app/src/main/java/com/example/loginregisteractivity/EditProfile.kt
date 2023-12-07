package com.example.loginregisteractivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EditProfile : AppCompatActivity() {
    private lateinit var Button_editprofile : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        Button_editprofile=findViewById(R.id.edit_button)

        Button_editprofile.setOnClickListener{
            val move =Intent(this@EditProfile, LoginActivity::class.java)
            startActivity(move)
        }
    }
}