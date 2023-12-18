package com.example.loginregisteractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class KueBasah : AppCompatActivity() {
    private lateinit var Ib_onde : ImageButton
    private lateinit var Ib_talam : ImageButton
    private lateinit var Ib_bika : ImageButton
    private lateinit var Ib_pinyaram : ImageButton
    private lateinit var Ib_galamai : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kue_basah)

        Ib_onde = findViewById(R.id.Bsh_gambar1)
        Ib_talam = findViewById(R.id.Bsh_gambar2)
        Ib_bika = findViewById(R.id.Bsh_gambar3)
        Ib_pinyaram = findViewById(R.id.Bsh_gambar4)
        Ib_galamai = findViewById(R.id.Bsh_gambar5)

        Ib_onde.setOnClickListener{
            val move = Intent(this@KueBasah, KueBasahOnde::class.java)
            startActivity(move)
        }

        Ib_talam.setOnClickListener {
            val move = Intent(this@KueBasah, KueBasahTalam::class.java)
            startActivity(move)
        }

        Ib_bika.setOnClickListener {
            val move = Intent(this@KueBasah, KueBasahBika::class.java)
            startActivity(move)
        }

        Ib_pinyaram.setOnClickListener {
            val move = Intent(this@KueBasah, KueBasahPinyaram::class.java)
            startActivity(move)
        }

        Ib_galamai.setOnClickListener {
            val move = Intent(this@KueBasah, KueBasahGalamai::class.java)
            startActivity(move)
        }


    }
}