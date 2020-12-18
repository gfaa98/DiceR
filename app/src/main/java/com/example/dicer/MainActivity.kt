package com.example.dicer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.dicer.R.drawable
import java.util.*
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            rollDice()
        }

        diceImage = findViewById(R.id.dice_imageview)
    }

    public fun rollDice(){
        val randomInt = Random().nextInt(6)+1
        var drawableResource = when(randomInt){
            1 -> drawable.dice_1
            2-> drawable.dice_2
            3-> drawable.dice_3
            4-> drawable.dice_4
            5-> drawable.dice_5
            else-> drawable.dice_6
        }

        val  diceImage: ImageView = findViewById(R.id.dice_imageview)
        diceImage.setImageResource(drawableResource)
    }
}