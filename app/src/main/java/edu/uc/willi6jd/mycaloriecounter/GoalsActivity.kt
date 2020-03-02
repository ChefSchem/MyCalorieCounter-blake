package edu.uc.willi6jd.mycaloriecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

/**
 * This will contorl the view when they get to the caloric goals page
 */
class GoalsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goals)

        // Get input (newGoal) field (by ID). Assign to variable
        var newCalorieGoal = findViewById<EditText>(R.id.newGoal) as EditText; //Name of food item: input text field
        var currentCalorieGoal = findViewById<EditText>(R.id.currentGoald) as EditText; //Name of food item: input text field

        // Assign variable to string
        var goal: String = newCalorieGoal.toString()

        // Push string to text value of TextView
        currentCalorieGoal.setText(goal)
    }
}
