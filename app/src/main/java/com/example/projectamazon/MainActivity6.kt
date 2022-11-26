package com.example.projectamazon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        val k = findViewById<Button>(R.id.button13)
        k.setOnClickListener {
            Toast.makeText(this, "Make Payment", Toast.LENGTH_SHORT).show()
            var j= Intent(applicationContext,MainActivity10::class.java)
            startActivity(j)

        }
    }
}