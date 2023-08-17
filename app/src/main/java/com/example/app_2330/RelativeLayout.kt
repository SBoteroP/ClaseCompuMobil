package com.example.app_2330

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast

class RelativeLayout : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        val spinner1: Spinner = findViewById(R.id.textView4)


        spinner1.onItemSelectedListener = this
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        val nivel = parent.selectedItem
        Toast.makeText(
            baseContext,
            "El item seleccionado es: " + parent.selectedItemId + " " + nivel,
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        // TODO("Not yet implemented")
    }
}