package com.example.starbuckstrainerappnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val standardBuildsButton: Button = findViewById(R.id.standardBuildsButton)

        standardBuildsButton.setOnClickListener {
            val intent = Intent(this, StandardBuildsActivity::class.java)
            startActivity(intent)
        }

        val beverageComponentRecipesButton: Button = findViewById(R.id.beverageComponentRecipesButton)

        beverageComponentRecipesButton.setOnClickListener {
            val intent = Intent(this, BeverageComponentRecipesActivity::class.java)
            startActivity(intent)
        }
    }
}