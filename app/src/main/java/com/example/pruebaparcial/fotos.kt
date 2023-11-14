package com.example.pruebaparcial

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class fotos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fotos)
        Saltar()
        val btnCamara = findViewById<Button>(R.id.btn_camara)

        btnCamara.setOnClickListener {
            startForResult.launch(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
        }

    }

    fun Saltar(){
        val saltar = findViewById<Button>(R.id.regresar)
        saltar.setOnClickListener(){
            val saltarV: Intent = Intent(this,Pantalla1::class.java)
            startActivity(saltarV)
        }

    }

    private val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result: ActivityResult ->
        if (result.resultCode == Activity.RESULT_OK) {
            val intent = result.data
            val imageBitmap = intent?.extras?.get("data") as Bitmap
            val imageView = findViewById<ImageView>(R.id.foto)
            imageView.setImageBitmap(imageBitmap)
            MediaStore.Images.Media.insertImage(
                contentResolver,
                imageBitmap,
                "Foto",
                "descripción_de_tu_imagen"
            )
        }


    }
}