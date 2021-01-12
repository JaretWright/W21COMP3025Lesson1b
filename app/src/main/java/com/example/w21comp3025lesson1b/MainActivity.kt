package com.example.w21comp3025lesson1b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitButton.setOnClickListener {
            var userName = editTextName.text
            Toast.makeText(this, "Hello $userName", Toast.LENGTH_LONG ).show()
        }
    }
}