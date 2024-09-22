package com.example.xando

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

open class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n", "ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var checkXAndO = true

        val viewWinPlayer = findViewById<TextView>(R.id.viewWinPlayer)
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
            viewWinPlayer.text = ""
        }


        // firsTrow

        firsTrow1.setOnClickListener {

            if (firsTrow1.text.isEmpty() && checkXAndO) {
                checkXAndO = false
                firsTrow1.text = "X"

            } else if (firsTrow1.text.isEmpty() && !checkXAndO) {
                checkXAndO = true
                firsTrow1.text = "O"
            }
            if (firsTrow1.text.contains("X") && firsTrow2.text.contains("X") && firsTrow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && firsTrow2.text.contains("O") && firsTrow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }

            if (firsTrow1.text.contains("X") && secondRow2.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && secondRow2.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.contains("X") && secondRow1.text.contains("X") && thirdRow1.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && secondRow1.text.contains("O") && thirdRow1.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.isNotEmpty() && firsTrow2.text.isNotEmpty() && firsTrow3.text.isNotEmpty() &&
                secondRow1.text.isNotEmpty() && secondRow2.text.isNotEmpty() && secondRow3.text.isNotEmpty() &&
                thirdRow1.text.isNotEmpty() && thirdRow2.text.isNotEmpty() && thirdRow3.text.isNotEmpty()
            ) {
                viewWinPlayer.text = " "
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "draw",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
        }



        firsTrow2.setOnClickListener {

            if (firsTrow2.text.isEmpty() && checkXAndO) {
                checkXAndO = false
                firsTrow2.text = "X"
            } else if (firsTrow2.text.isEmpty() && !checkXAndO) {
                checkXAndO = true
                firsTrow2.text = "O"
            }
            if (firsTrow1.text.contains("X") && firsTrow2.text.contains("X") && firsTrow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && firsTrow2.text.contains("O") && firsTrow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.contains("X") && secondRow2.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && secondRow2.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow2.text.contains("X") && secondRow2.text.contains("X") && thirdRow2.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow2.text.contains("O") && secondRow2.text.contains("O") && thirdRow2.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.isNotEmpty() && firsTrow2.text.isNotEmpty() && firsTrow3.text.isNotEmpty() &&
                secondRow1.text.isNotEmpty() && secondRow2.text.isNotEmpty() && secondRow3.text.isNotEmpty() &&
                thirdRow1.text.isNotEmpty() && thirdRow2.text.isNotEmpty() && thirdRow3.text.isNotEmpty()
            ) {
                viewWinPlayer.text = " "
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "draw",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
        }


        firsTrow3.setOnClickListener {

            if (firsTrow3.text.isEmpty() && checkXAndO) {
                checkXAndO = false
                firsTrow3.text = "X"
            } else if (firsTrow3.text.isEmpty() && !checkXAndO) {
                checkXAndO = true
                firsTrow3.text = "O"
            }
            if (firsTrow1.text.contains("X") && firsTrow2.text.contains("X") && firsTrow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && firsTrow2.text.contains("O") && firsTrow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow3.text.contains("X") && secondRow2.text.contains("X") && thirdRow1.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow3.text.contains("O") && secondRow2.text.contains("O") && thirdRow1.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow3.text.contains("X") && secondRow3.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow3.text.contains("O") && secondRow3.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.isNotEmpty() && firsTrow2.text.isNotEmpty() && firsTrow3.text.isNotEmpty() &&
                secondRow1.text.isNotEmpty() && secondRow2.text.isNotEmpty() && secondRow3.text.isNotEmpty() &&
                thirdRow1.text.isNotEmpty() && thirdRow2.text.isNotEmpty() && thirdRow3.text.isNotEmpty()
            ) {
                viewWinPlayer.text = " "
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "draw",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
        }


        // secondRow

        secondRow1.setOnClickListener {

            if (secondRow1.text.isEmpty() && checkXAndO) {
                checkXAndO = false
                secondRow1.text = "X"
            } else if (secondRow1.text.isEmpty() && !checkXAndO) {
                checkXAndO = true
                secondRow1.text = "O"
            }
            if (secondRow1.text.contains("X") && secondRow2.text.contains("X") && secondRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (secondRow1.text.contains("O") && secondRow2.text.contains("O") && secondRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.contains("X") && secondRow2.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && secondRow2.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.contains("X") && secondRow1.text.contains("X") && thirdRow1.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && secondRow1.text.contains("O") && thirdRow1.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.isNotEmpty() && firsTrow2.text.isNotEmpty() && firsTrow3.text.isNotEmpty() &&
                secondRow1.text.isNotEmpty() && secondRow2.text.isNotEmpty() && secondRow3.text.isNotEmpty() &&
                thirdRow1.text.isNotEmpty() && thirdRow2.text.isNotEmpty() && thirdRow3.text.isNotEmpty()
            ) {
                viewWinPlayer.text = " "
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "draw",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
        }


        secondRow2.setOnClickListener {

            if (secondRow2.text.isEmpty() && checkXAndO) {
                checkXAndO = false
                secondRow2.text = "X"
            } else if (secondRow2.text.isEmpty() && !checkXAndO) {
                checkXAndO = true
                secondRow2.text = "O"
            }
            if (secondRow1.text.contains("X") && secondRow2.text.contains("X") && secondRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (secondRow1.text.contains("O") && secondRow2.text.contains("O") && secondRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.contains("X") && secondRow2.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && secondRow2.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.contains("X") && secondRow1.text.contains("X") && thirdRow1.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && secondRow1.text.contains("O") && thirdRow1.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow2.text.contains("X") && secondRow2.text.contains("X") && thirdRow2.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow2.text.contains("O") && secondRow2.text.contains("O") && thirdRow2.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.isNotEmpty() && firsTrow2.text.isNotEmpty() && firsTrow3.text.isNotEmpty() &&
                secondRow1.text.isNotEmpty() && secondRow2.text.isNotEmpty() && secondRow3.text.isNotEmpty() &&
                thirdRow1.text.isNotEmpty() && thirdRow2.text.isNotEmpty() && thirdRow3.text.isNotEmpty()
            ) {
                viewWinPlayer.text = " "
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "draw",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
        }


        secondRow3.setOnClickListener {

            if (secondRow3.text.isEmpty() && checkXAndO) {
                checkXAndO = false
                secondRow3.text = "X"
            } else if (secondRow3.text.isEmpty() && !checkXAndO) {
                checkXAndO = true
                secondRow3.text = "O"
            }
            if (secondRow1.text.contains("X") && secondRow2.text.contains("X") && secondRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (secondRow1.text.contains("O") && secondRow2.text.contains("O") && secondRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.contains("X") && secondRow2.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && secondRow2.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow3.text.contains("X") && secondRow3.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow3.text.contains("O") && secondRow3.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.isNotEmpty() && firsTrow2.text.isNotEmpty() && firsTrow3.text.isNotEmpty() &&
                secondRow1.text.isNotEmpty() && secondRow2.text.isNotEmpty() && secondRow3.text.isNotEmpty() &&
                thirdRow1.text.isNotEmpty() && thirdRow2.text.isNotEmpty() && thirdRow3.text.isNotEmpty()
            ) {
                viewWinPlayer.text = " "
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "draw",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
        }


        // thirdRow

        thirdRow1.setOnClickListener {

            if (thirdRow1.text.isEmpty() && checkXAndO) {
                checkXAndO = false
                thirdRow1.text = "X"
            } else if (thirdRow1.text.isEmpty() && !checkXAndO) {
                checkXAndO = true
                thirdRow1.text = "O"
            }
            if (thirdRow1.text.contains("X") && thirdRow2.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (thirdRow1.text.contains("O") && thirdRow2.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow3.text.contains("X") && secondRow2.text.contains("X") && thirdRow1.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow3.text.contains("O") && secondRow2.text.contains("O") && thirdRow1.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.contains("X") && secondRow1.text.contains("X") && thirdRow1.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && secondRow1.text.contains("O") && thirdRow1.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.isNotEmpty() && firsTrow2.text.isNotEmpty() && firsTrow3.text.isNotEmpty() &&
                secondRow1.text.isNotEmpty() && secondRow2.text.isNotEmpty() && secondRow3.text.isNotEmpty() &&
                thirdRow1.text.isNotEmpty() && thirdRow2.text.isNotEmpty() && thirdRow3.text.isNotEmpty()
            ) {
                viewWinPlayer.text = " "
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "draw",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
        }


        thirdRow2.setOnClickListener {

            if (thirdRow2.text.isEmpty() && checkXAndO) {
                checkXAndO = false
                thirdRow2.text = "X"
            } else if (thirdRow2.text.isEmpty() && !checkXAndO) {
                checkXAndO = true
                thirdRow2.text = "O"
            }
            if (thirdRow1.text.contains("X") && thirdRow2.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (thirdRow1.text.contains("O") && thirdRow2.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.contains("X") && secondRow2.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && secondRow2.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow2.text.contains("X") && secondRow2.text.contains("X") && thirdRow2.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow2.text.contains("O") && secondRow2.text.contains("O") && thirdRow2.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.isNotEmpty() && firsTrow2.text.isNotEmpty() && firsTrow3.text.isNotEmpty() &&
                secondRow1.text.isNotEmpty() && secondRow2.text.isNotEmpty() && secondRow3.text.isNotEmpty() &&
                thirdRow1.text.isNotEmpty() && thirdRow2.text.isNotEmpty() && thirdRow3.text.isNotEmpty()
            ) {
                viewWinPlayer.text = " "
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "draw",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
        }


        thirdRow3.setOnClickListener {

            if (thirdRow3.text.isEmpty() && checkXAndO) {
                checkXAndO = false
                thirdRow3.text = "X"
            } else if (thirdRow3.text.isEmpty() && !checkXAndO) {
                checkXAndO = true
                thirdRow3.text = "O"
            }
            if (thirdRow1.text.contains("X") && thirdRow2.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (thirdRow1.text.contains("O") && thirdRow2.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow3.text.contains("X") && secondRow3.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow3.text.contains("O") && secondRow3.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.contains("X") && secondRow2.text.contains("X") && thirdRow3.text.contains(
                    "X"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for X win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            } else if (firsTrow1.text.contains("O") && secondRow2.text.contains("O") && thirdRow3.text.contains(
                    "O"
                )
            ) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "player for O win",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
            if (firsTrow1.text.isNotEmpty() && firsTrow2.text.isNotEmpty() && firsTrow3.text.isNotEmpty() &&
                secondRow1.text.isNotEmpty() && secondRow2.text.isNotEmpty() && secondRow3.text.isNotEmpty() &&
                thirdRow1.text.isNotEmpty() && thirdRow2.text.isNotEmpty() && thirdRow3.text.isNotEmpty()
            ) {
                viewWinPlayer.text = " "
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "draw",
                    Snackbar.LENGTH_LONG
                ).show()
                repeat.visibility = View.VISIBLE
            }
        }
    }
}



