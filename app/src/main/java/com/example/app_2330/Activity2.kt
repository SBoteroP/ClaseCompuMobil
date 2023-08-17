package com.example.app_2330

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var text2: TextView = findViewById(R.id.titulo3)
        var nombre = intent.getStringExtra("texto")

        if (nombre != null) {
            Log.i("Prueba P.2", "llego" + nombre)
        }


    }
}