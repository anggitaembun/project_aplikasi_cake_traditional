package com.example.loginregisteractivity

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class KueKering : AppCompatActivity() {
    private lateinit var Image_gambar1 : ImageButton
    private lateinit var Image_gambar2 : ImageButton
    private lateinit var Image_gambar3 : ImageButton
    private lateinit var Image_gambar4 : ImageButton
    private lateinit var Image_gambar5 : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kue_kering)

        Image_gambar1 = findViewById(R.id.K_gambar1)
        Image_gambar2 = findViewById(R.id.K_gambar2)
        Image_gambar3 = findViewById(R.id.K_gambar3)
        Image_gambar4 = findViewById(R.id.K_gambar4)
        Image_gambar5 = findViewById(R.id.K_gambar5)

        Image_gambar1.setOnClickListener {
            val move = Intent(this@KueKering, KueKeringBalam::class.java)
            startActivity(move)
        }

        Image_gambar2.setOnClickListener {
            val move = Intent(this@KueKering, KueKeringLoyang::class.java)
            startActivity(move)
        }

        Image_gambar3.setOnClickListener {
            val move = Intent(this@KueKering, KueKeringSapik::class.java)
            startActivity(move)
        }

        Image_gambar4.setOnClickListener {
            val move = Intent(this@KueKering, KueKeringAraiPinang::class.java)
            startActivity(move)
        }

        Image_gambar5.setOnClickListener {
            val move = Intent(this@KueKering,  KueKeringKarakKaliang::class.java)
            startActivity(move)
        }


    }
}