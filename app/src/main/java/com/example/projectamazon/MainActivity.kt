package com.example.projectamazon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a="cse"
        val b="123"
        val c=findViewById<EditText>(R.id.editText)
        val d=findViewById<EditText>(R.id.editText2)
        val e=findViewById<Button>(R.id.button)
        e.setOnClickListener {
            if((a.toString()==c.text.toString()) && (b.toString()==d.text.toString())) {
                Toast.makeText(this, "Login Successfull", Toast.LENGTH_LONG).show()
                var i = Intent(applicationContext,MainActivity2::class.java)
                startActivity(i)
            }else
                Toast.makeText(this,"Not Successfull",Toast.LENGTH_LONG).show()



            }

        }
    }
