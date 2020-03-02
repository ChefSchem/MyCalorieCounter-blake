package edu.uc.willi6jd.mycaloriecounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

/**
 * This will control the view when they get to the food page
 */
class FoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val btnCreate = findViewById(R.id.btnCreateFoodItem) as Button //Create food item button

        btnCreate.setOnClickListener {

            // Get input fields. Store them to food item variables
            var itemName = findViewById<EditText>(R.id.foodName); //Name of food item: input text field
            var itemCalories = findViewById<EditText>(R.id.foodCalories); //Calorie amount of food item: integer
            var itemSugar = findViewById<EditText>(R.id.foodSugar); //Sugar amount of food item: integer
            var itemProtein = findViewById<EditText>(R.id.foodProtein); //Protein amount of food: integer

            // Put food item variables into foodItem Object
            fun foodItem(nm: String, cal: Int, sgr: Int, pro: Int) {
                FoodItem.name = nm;
                FoodItem.calories = cal;
                FoodItem.sugar = sgr;
                FoodItem.protein = pro;
            }

            // Build FoodItem Array
            val foodItemArray = Array(20) { }

            // Push foodItem to FoodItem Array
            foodItemArray.add(foodItem(nm, cal, sgr, pro))
        }
    }

    object FoodItem {
        var name = "";
        var calories = 0;
        var sugar = 0;
        var protein = 0;
    }

}
