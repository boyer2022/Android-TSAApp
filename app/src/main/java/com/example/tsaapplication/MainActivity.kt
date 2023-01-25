package com.example.tsaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    // Private = only accessible to this Class
        // lateinit = Its ok to specify there is a button here without initializing it, will be later
    private lateinit var tapHereButton: Button
    // Reference to arrow buttons
    private lateinit var leftArrow: ImageButton
    private lateinit var rightArrow: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the lateinit variable for the tapHereButton
            // findViewById must have resource
        tapHereButton = findViewById(R.id.tap_here_button)
        leftArrow = findViewById(R.id.left_arrow)
        rightArrow = findViewById(R.id.right_arrow)

        // Event Handler
        tapHereButton.setOnClickListener{
            // Function for getting the arrow
            showRandomArrow()
        }
    }

    private fun showRandomArrow() {
        // Hide tapHerButton
        tapHereButton.visibility = View.INVISIBLE
        // Picking a direction
            // list
                // random will pick one of the elements in the list at random
        val direction = listOf("left", "right").random()
        if (direction == "left") {
            leftArrow.visibility = View.VISIBLE
        } else {
            rightArrow.visibility = View.VISIBLE
        }
    }
}