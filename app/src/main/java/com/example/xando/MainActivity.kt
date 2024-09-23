package com.example.xando

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

open class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n", "ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var checkXAndO = true
        var checker = true


        val repeat = findViewById<ImageButton>(R.id.repeat)
        repeat.visibility = View.GONE

        val firsTrow1 = findViewById<TextView>(R.id.firsTrow1)
        val firsTrow2 = findViewById<TextView>(R.id.firsTrow2)
        val firsTrow3 = findViewById<TextView>(R.id.firsTrow3)

        val secondRow1 = findViewById<TextView>(R.id.secondRow1)
        val secondRow2 = findViewById<TextView>(R.id.secondRow2)
        val secondRow3 = findViewById<TextView>(R.id.secondRow3)

        val thirdRow1 = findViewById<TextView>(R.id.thirdRow1)
        val thirdRow2 = findViewById<TextView>(R.id.thirdRow2)
        val thirdRow3 = findViewById<TextView>(R.id.thirdRow3)


        repeat.setOnClickListener {
            checker = true
            checkXAndO = true

            firsTrow1.text = ""
            firsTrow2.text = ""
            firsTrow3.text = ""

            secondRow1.text = ""
            secondRow2.text = ""
            secondRow3.text = ""

            thirdRow1.text = ""
            thirdRow2.text = ""
            thirdRow3.text = ""
            repeat.visibility = View.GONE
        }

        fun checkWinner(player: String): Boolean {
            if (firsTrow1.text == player && firsTrow2.text == player && firsTrow3.text == player) return true
            if (secondRow1.text == player && secondRow2.text == player && secondRow3.text == player) return true
            if (thirdRow1.text == player && thirdRow2.text == player && thirdRow3.text == player) return true

            if (firsTrow1.text == player && secondRow1.text == player && thirdRow1.text == player) return true
            if (firsTrow2.text == player && secondRow2.text == player && thirdRow2.text == player) return true
            if (firsTrow3.text == player && secondRow3.text == player && thirdRow3.text == player) return true

            if (firsTrow1.text == player && secondRow2.text == player && thirdRow3.text == player) return true
            if (firsTrow3.text == player && secondRow2.text == player && thirdRow1.text == player) return true

            return false
        }

        fun checkForDraw(player: String): Boolean {
            if (firsTrow1.text.isNotEmpty() && firsTrow2.text.isNotEmpty() && firsTrow3.text.isNotEmpty() &&
                secondRow1.text.isNotEmpty() && secondRow2.text.isNotEmpty() && secondRow3.text.isNotEmpty() &&
                thirdRow1.text.isNotEmpty() && thirdRow2.text.isNotEmpty() && thirdRow3.text.isNotEmpty()
            ) return true

            return false
        }

        val buttons = listOf(
            firsTrow1,
            firsTrow2,
            firsTrow3,
            secondRow1,
            secondRow2,
            secondRow3,
            thirdRow1,
            thirdRow2,
            thirdRow3
        )

        buttons.forEach { button ->
            button.setOnClickListener {
                if (checker) {
                    if (button.text.isEmpty() && checkXAndO) {
                        checkXAndO = false
                        button.text = "X"
                    } else if (button.text.isEmpty() && !checkXAndO) {
                        checkXAndO = true
                        button.text = "O"
                    }
                }

                if (checkWinner("X")) {
                    Snackbar.make(findViewById(android.R.id.content), "Player for X win", Snackbar.LENGTH_LONG).show()
                    repeat.visibility = View.VISIBLE
                    checker = false
                } else if (checkWinner("O")) {
                    Snackbar.make(findViewById(android.R.id.content), "Player for O win", Snackbar.LENGTH_LONG).show()
                    repeat.visibility = View.VISIBLE
                    checker = false
                }
                if (checkForDraw("X")) {
                    Snackbar.make(findViewById(android.R.id.content), "Draw", Snackbar.LENGTH_LONG).show()
                    repeat.visibility = View.VISIBLE
                    checker = false
                }else if (checkForDraw("O")) {
                    Snackbar.make(findViewById(android.R.id.content), "Draw", Snackbar.LENGTH_LONG).show()
                    repeat.visibility = View.VISIBLE
                    checker = false
                }
            }
        }
    }
}