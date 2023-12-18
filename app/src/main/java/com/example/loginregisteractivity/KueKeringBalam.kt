package com.example.loginregisteractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KueKeringBalam : AppCompatActivity() {
    private lateinit var Button_send : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kue_kering_balam)

        Button_send = findViewById(R.id.button_send)

        Button_send.setOnClickListener {
            val move = Intent(this@KueKeringBalam, KueKeringBalam::class.java)
            startActivity(move)
        }
    }
}