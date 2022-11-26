package com.example.projectamazon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)
        val k = findViewById<Button>(R.id.button20)
        k.setOnClickListener {
            Toast.makeText(this, "thanks for shopping", Toast.LENGTH_LONG).show()

        }
    }
}