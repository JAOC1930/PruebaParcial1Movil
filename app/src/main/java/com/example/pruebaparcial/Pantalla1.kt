package com.example.pruebaparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pantalla1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla1)

        Saltar2()
    }


    fun Saltar2(){
        val saltar = findViewById<Button>(R.id.cerrarS)
        saltar.setOnClickListener(){
            val saltarV: Intent = Intent(this,MainActivity::class.java)
            startActivity(saltarV)
        }

    }
}