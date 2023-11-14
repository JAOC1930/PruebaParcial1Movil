package com.example.pruebaparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        Saltar()
    }


    fun Saltar(){
        val saltar = findViewById<Button>(R.id.loginR)
        saltar.setOnClickListener(){
            val saltarV: Intent = Intent(this,MainActivity::class.java)
            startActivity(saltarV)
        }

    }
}