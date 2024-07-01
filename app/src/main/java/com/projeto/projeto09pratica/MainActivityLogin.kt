package com.projeto.projeto09pratica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityLogin : AppCompatActivity() {

    private lateinit var entrarDetalhes: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main_login)

        entrarDetalhes = findViewById(R.id.btn_Registro)

        entrarDetalhes.setOnClickListener {

            val proximoDetalhes = Intent(this, MainActivityRegistro::class.java)

            startActivity(proximoDetalhes)
        }
    }
}