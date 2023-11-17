package com.example.woodpricechecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forInput = findViewById<EditText>(R.id.edInput)
        val forButton = findViewById<Button>(R.id.btnCheck)
        val forOutput = findViewById<TextView>(R.id.tvDisplay)

        forButton.setOnClickListener {
            val wood = forInput.text.toString().trim().uppercase().firstOrNull()

            val result = when(wood){
                'O' -> "Oak = \$100"
                'P' -> "Pine = \$300"
                'M' -> "Mahogany = \$1000"
                else -> "Invalid"
            }
            forOutput.text = result
            Toast.makeText(this, result,Toast.LENGTH_SHORT).show()
        }

    }
}