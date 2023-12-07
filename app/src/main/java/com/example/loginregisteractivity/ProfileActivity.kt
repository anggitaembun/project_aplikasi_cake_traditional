package com.example.loginregisteractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    private lateinit var button_edit: Button
    private lateinit var button_logout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        button_edit = findViewById(R.id.P_button1)
        button_logout = findViewById(R.id.P_button2)


        button_edit.setOnClickListener {
            val move = Intent(this@ProfileActivity, EditProfile::class.java)
            startActivity(move)

        }

        button_logout.setOnClickListener {
            val move = Intent(this@ProfileActivity, LoginActivity::class.java)
            startActivity(move)
        }
    }
}