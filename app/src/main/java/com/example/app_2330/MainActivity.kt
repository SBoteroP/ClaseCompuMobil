package com.example.app_2330

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1:TextView=findViewById(R.id.Titulo1)
        val t:EditText=findViewById(R.id.Edit2)
        val but:Button=findViewById(R.id.button6)
        val but1:Button=findViewById(R.id.button8)
        val but2:Button=findViewById(R.id.button7)

        text1.text="La Ponti"
        var intent = Intent(this,Activity2::class.java)
        var intent2 = Intent(this,RelativeLayout::class.java)

        but.setOnClickListener {
            showToast(t.text)
        }
        but1.setOnClickListener {
            var intent=Intent(this,Activity2::class.java)
            intent.putExtra("texto",t.text.toString())
            startActivity(intent)
        }
        Toast.makeText(this,"Hola",Toast.LENGTH_SHORT).show()

        but2.setOnClickListener {
            var intent=Intent(this,RelativeLayout::class.java)
            startActivity(intent)
        }

    }
    fun showToast(nom: Editable){
        Toast.makeText(this,"Guenos diaz "+ nom.toString(),Toast.LENGTH_SHORT).show()
    }

}