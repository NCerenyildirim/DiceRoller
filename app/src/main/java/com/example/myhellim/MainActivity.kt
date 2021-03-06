package com.example.ZarAtma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity(){
    private lateinit var button: Button
    private lateinit var dice1: ImageView
    //lateiniti kaldırırsan imageView'ın sonuna soru işareti = null yazarakta yapabilirsin


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button= findViewById(R.id.mybutton)
        dice1 = findViewById(R.id.dice1)

        button.setOnClickListener {
            rollDice()
        }

      }

    private  fun rollDice() {
    val randomInt = Random().nextInt(6)+1
    val drawableResource = when(randomInt){


        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
// ilk zarın boş olması için kaynağı boş olana göre yapıcaz o yüzden tools name spaceten yaptık
    }
       dice1.setImageResource(drawableResource)
    }
   /* override fun onClick(view: View?) {
        when(view?.id){

            R.id.mybutton -> {
                Toast.makeText(application, "Button Clicked", Toast.LENGTH_SHORT).show()
            }
        }
*/
    }


