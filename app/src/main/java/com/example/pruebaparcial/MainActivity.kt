package com.example.pruebaparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Splash)
        setTheme(R.style.Theme_PruebaParcial)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Saltar()
        Saltar2()

    }

    fun Saltar(){
        val saltar = findViewById<Button>(R.id.registro)
        saltar.setOnClickListener(){
            val saltarV: Intent = Intent(this,Registro::class.java)
            startActivity(saltarV)
        }

    }

    fun Saltar2(){
        val saltar = findViewById<Button>(R.id.ingresar)
        saltar.setOnClickListener(){
            val saltarV: Intent = Intent(this,Pantalla1::class.java)
            startActivity(saltarV)
        }

    }
}