package com.example.xando

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.xando.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

open class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId", "SetTextI18n", "ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        var checkXAndO = true
        var checker = true


        binding.repeat
        binding.repeat.visibility = View.GONE


        binding.repeat.setOnClickListener {
            checker = true
            checkXAndO = true

            binding.firsTrow1.text = ""
            binding.firsTrow2.text = ""
            binding.firsTrow3.text = ""

            binding.secondRow1.text = ""
            binding.secondRow2.text = ""
            binding.secondRow3.text = ""

            binding.thirdRow1.text = ""
            binding.thirdRow2.text = ""
            binding.thirdRow3.text = ""
            binding.repeat.visibility = View.GONE
        }

        fun checkWinner(player: String): Boolean {
            if (binding.firsTrow1.text == player && binding.firsTrow2.text == player && binding.firsTrow3.text == player) return true
            if (binding.secondRow1.text == player && binding.secondRow2.text == player && binding.secondRow3.text == player) return true
            if (binding.thirdRow1.text == player && binding.thirdRow2.text == player && binding.thirdRow3.text == player) return true

            if (binding.firsTrow1.text == player && binding.secondRow1.text == player && binding.thirdRow1.text == player) return true
            if (binding.firsTrow2.text == player && binding.secondRow2.text == player && binding.thirdRow2.text == player) return true
            if (binding.firsTrow3.text == player && binding.secondRow3.text == player && binding.thirdRow3.text == player) return true

            if (binding.firsTrow1.text == player && binding.secondRow2.text == player && binding.thirdRow3.text == player) return true
            if (binding.firsTrow3.text == player && binding.secondRow2.text == player && binding.thirdRow1.text == player) return true

            return false
        }

        fun checkForDraw(player: String): Boolean {
            if (binding.firsTrow1.text.isNotEmpty() && binding.firsTrow2.text.isNotEmpty() && binding.firsTrow3.text.isNotEmpty() && binding.secondRow1.text.isNotEmpty() && binding.secondRow2.text.isNotEmpty() && binding.secondRow3.text.isNotEmpty() && binding.thirdRow1.text.isNotEmpty() && binding.thirdRow2.text.isNotEmpty() && binding.thirdRow3.text.isNotEmpty()) {
                return true

            }

            return false
        }

        val buttons = listOf(
            binding.firsTrow1,
            binding.firsTrow2,
            binding.firsTrow3,
            binding.secondRow1,
            binding.secondRow2,
            binding.secondRow3,
            binding.thirdRow1,
            binding.thirdRow2,
            binding.thirdRow3
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
                    Snackbar.make(
                        findViewById(android.R.id.content),
                        "Player for X wins",
                        Snackbar.LENGTH_LONG
                    ).show()
                    binding.repeat.visibility = View.VISIBLE
                    checker = false
                } else if (checkWinner("O")) {
                    Snackbar.make(
                        findViewById(android.R.id.content),
                        "Player for O wins",
                        Snackbar.LENGTH_LONG
                    ).show()
                    binding.repeat.visibility = View.VISIBLE
                    checker = false
                } else if (checkForDraw("")) { // Если никто не выиграл, проверяем на ничью
                    Snackbar.make(
                        findViewById(android.R.id.content), "Draw", Snackbar.LENGTH_LONG
                    ).show()
                    binding.repeat.visibility = View.VISIBLE
                    checker = false
                }
            }
        }
    }
}