package com.example.loginregisteractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KueKeringKarakKaliang : AppCompatActivity() {
    private lateinit var Button_send : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kue_kering_karak_kaliang)

        Button_send.setOnClickListener {
            val move = Intent(this@KueKeringKarakKaliang, KueKeringKarakKaliang::class.java)
            startActivity(move)
        }
    }
}