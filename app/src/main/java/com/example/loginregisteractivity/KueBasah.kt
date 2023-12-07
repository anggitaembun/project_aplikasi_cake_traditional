package com.example.loginregisteractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class KueBasah : AppCompatActivity() {
    private lateinit var Ib_onde : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kue_basah)

        Ib_onde=findViewById(R.id.Bsh_gambar1)

        Ib_onde.setOnClickListener{
            val move = Intent(this@KueBasah, KueBasahOnde::class.java)
            startActivity(move)
        }


    }
}