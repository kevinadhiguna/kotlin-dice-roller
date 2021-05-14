package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get a reference to the 'roll_button' button
        val rollButton: Button = findViewById(R.id.roll_button)
    }

    // Add a click handler to display a toast
    private fun rollDice() {
        Toast.makeText(this, "button clicked !",
            Toast.LENGTH_SHORT).show()
    }
}