package com.example.loginregisteractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HalamanUtama : AppCompatActivity() {
    private lateinit var ImageProfile: ImageView
    private lateinit var Button_k : Button
    private lateinit var Button_b :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)

        ImageProfile= findViewById(R.id.profile_button)
        Button_b= findViewById(R.id.U_btn_1)
        Button_k= findViewById(R.id.U_btn_2)

        ImageProfile.setOnClickListener{
            val move =Intent(this@HalamanUtama, ProfileActivity::class.java)
            startActivity(move)
        }

        Button_b.setOnClickListener{
            val move = Intent(this@HalamanUtama, KueBasah::class.java)
            startActivity(move)
        }

        Button_k.setOnClickListener{
            val move = Intent(this@HalamanUtama, KueKering::class.java)
            startActivity(move)
        }


        }
    }
