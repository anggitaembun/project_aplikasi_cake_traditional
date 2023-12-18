package com.example.loginregisteractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KueBasahOnde : AppCompatActivity() {
    private lateinit var Button_send : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kue_basah_onde)

        Button_send = findViewById(R.id.button_send)

        Button_send.setOnClickListener {
            val move = Intent(this@KueBasahOnde, KueBasahOnde::class.java)
            startActivity(move)
        }
    }
}