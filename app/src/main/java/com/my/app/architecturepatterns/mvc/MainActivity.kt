package com.my.app.architecturepatterns.mvc

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var editTextname = findViewById<EditText>(R.id.edtname)
        var editTextage = findViewById<EditText>(R.id.edtage)
        var textView = findViewById<TextView>(R.id.tv)
        var button = findViewById<Button>(R.id.btn)



        button.setOnClickListener {
            var userTextname = editTextname.text.toString()
            var userTextage = editTextage.text.toString()

            val age = userTextage.toIntOrNull() ?: 0
            val name = if (userTextname.isEmpty()) "Unknown" else userTextname

            var userModel = Model(name = name, age = age)
            textView.text = "Your name is: ${userModel.name}, and your age is: ${userModel.age} Years old "

        }

    }
}