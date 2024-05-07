package com.example.mytamagotchiapp2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var PetImageView: ImageView

    private var happy = 100
    private var hunger = 50
    private var cleanliness= 50


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setupGameScreen()
    }


    private fun setupGameScreen() {
        PetImageView = findViewById(R.id.ImageView)
        val FeedButton: Button = findViewById(R.id.feedButton)
        val cleanButton: Button = findViewById(R.id.bathButton)
        val PlayButton: Button = findViewById(R.id.playButton)

        FeedButton.setOnClickListener {
            PetImageView.setImageResource(R.drawable.feed)
            updatePetStatus("feed")
        }

        cleanButton.setOnClickListener {
            PetImageView.setImageResource(R.drawable.bath)
            updatePetStatus("bath")
        }

        PlayButton.setOnClickListener {
            PetImageView.setImageResource(R.drawable.play)
            updatePetStatus("play")
        }
    }

    private fun updatePetStatus(action: String) {
        when (action) {
            "feed" -> {
                hunger +=20
                if (hunger > 100) hunger = 100
            }
            "bath" -> {
                cleanliness += 20
                if (cleanliness > 100) cleanliness = 100
            }
            "play" -> {
                happy += 20
                if (happy > 100) happy= 100
            }
        }
        //upate progress bars
        updateProgressBars()
    }

    private fun updateProgressBars() {
        //Update progress bars based on current values
    }
}