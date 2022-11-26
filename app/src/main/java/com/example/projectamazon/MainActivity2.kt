package com.example.projectamazon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var g=findViewById<Button>(R.id.button2)
        g.setOnClickListener {
            Toast.makeText(this@MainActivity2,"Entering",Toast.LENGTH_LONG).show()
            var j=Intent(applicationContext,MainActivity7::class.java)
            startActivity(j)
        var h=findViewById<Button>(R.id.button3)
        h.setOnClickListener {
            Toast.makeText(this@MainActivity2,"Entering",Toast.LENGTH_LONG).show()
            var j=Intent(applicationContext,MainActivity4::class.java)
            startActivity(j)
        var i=findViewById<Button>(R.id.button4)
        i.setOnClickListener {
            Toast.makeText(this@MainActivity2,"Entering",Toast.LENGTH_LONG).show()
            var j=Intent(applicationContext,MainActivity5::class.java)
            startActivity(j)
        var k=findViewById<Button>(R.id.button5)
        k.setOnClickListener {
            Toast.makeText(this@MainActivity2,"Entering",Toast.LENGTH_LONG).show()
            var j=Intent(applicationContext,MainActivity6::class.java)
            startActivity(j)

        }
        }
        }
        }
    }
}