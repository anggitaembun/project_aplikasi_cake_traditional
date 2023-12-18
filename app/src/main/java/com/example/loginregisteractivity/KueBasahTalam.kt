package com.example.loginregisteractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KueBasahTalam : AppCompatActivity() {
    private lateinit var Button_send : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kue_basah_talam)

        Button_send = findViewById(R.id.button_send)

        Button_send.setOnClickListener {
            val move = Intent(this@KueBasahTalam, KueBasahTalam::class.java)
            startActivity(move)
        }
    }
}