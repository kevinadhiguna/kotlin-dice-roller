package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get a reference to the 'roll_button' button
        val rollButton: Button = findViewById(R.id.roll_button)

        // Call rollDice function to set onClickListener
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    // Add a click handler to display a toast
    private fun rollDice() {
        // Toast.makeText(this, "button clicked !",
        //    Toast.LENGTH_SHORT).show()

        // Get a random number between 1 and 6
        val randomInt = (1..6).random()

        // Get a reference to the TextView
        val resultText: TextView = findViewById(R.id.result_text)

        // Change the "Hello World" text to "Dice Rolled!" on button click
        // resultText.text = "Dice Rolled!"

        // Set the text property to the value of the random integer, as a string
        resultText.text = randomInt.toString()
    }
}