package com.example.mytamagotchiapp2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    //declare variables
    //the keyword lateinit allows us to initialize a variable at a later stage
    private lateinit var openButton: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //making use of the find view by ID method
        //initializing the variable by getting reference to the button
        //get reference by using the ID name


        openButton = findViewById(R.id.startButton)
        openButton.setOnClickListener{

            //create variable
            var Intent= Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }
    }
}