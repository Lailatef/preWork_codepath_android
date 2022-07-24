package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button1 = findViewById<Button>(R.id.button)
        button1.setOnClickListener {
         Log.v("Hello world","Button clicked!")
          Toast.makeText(this, "Hello to YOU too!", Toast.LENGTH_SHORT).show()
        }
    }
}
