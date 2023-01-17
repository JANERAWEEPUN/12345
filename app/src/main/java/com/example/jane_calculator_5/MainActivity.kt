package com.example.jane_calculator_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Num = 0


        Zero.setOnClickListener {
            if (Show_All.text.toString().equals("0"))
            {
                Show_All.setText("0")
            }
            else
            {
                var Numbers = Show_All.text.toString().plus("0")
                Show_All.setText(Numbers)
            }
        }
        One.setOnClickListener {
            if (Show_All.text.toString().equals("0"))
            {
                Show_All.setText("1")
            }
            else {
                var Numbers = Show_All.text.toString().plus("1")
                Show_All.setText(Numbers)
            }
        }
        Two.setOnClickListener {
            if (Show_All.text.toString().equals("0"))
            {
                Show_All.setText("2")
            }
            else {
                var Numbers = Show_All.text.toString().plus("2")
                Show_All.setText(Numbers)
            }
        }
        Tree.setOnClickListener {
            if (Show_All.text.toString().equals("0"))
            {
                Show_All.setText("3")
            }
            else {
                var Numbers = Show_All.text.toString().plus("3")
                Show_All.setText(Numbers)
            }
        }
        Four.setOnClickListener {
            if (Show_All.text.toString().equals("0"))
            {
                Show_All.setText("4")
            }
            else {
                var Numbers = Show_All.text.toString().plus("4")
                Show_All.setText(Numbers)
            }
        }
        Five.setOnClickListener {
            if (Show_All.text.toString().equals("0"))
            {
                Show_All.setText("5")
            }
            else {
                var Numbers = Show_All.text.toString().plus("5")
                Show_All.setText(Numbers)
            }
        }
        Six.setOnClickListener {
            if (Show_All.text.toString().equals("0"))
            {
                Show_All.setText("6")
            }
            else {
                var Numbers = Show_All.text.toString().plus("6")
                Show_All.setText(Numbers)
            }
        }
        Seven.setOnClickListener {
            if (Show_All.text.toString().equals("0"))
            {
                Show_All.setText("7")
            }
            else {
                var Numbers = Show_All.text.toString().plus("7")
                Show_All.setText(Numbers)
            }
        }
        Eight.setOnClickListener {
            if (Show_All.text.toString().equals("0"))
            {
                Show_All.setText("8")
            }
            else {
                var Numbers = Show_All.text.toString().plus("8")
                Show_All.setText(Numbers)
            }
        }
        Nine.setOnClickListener {
            if (Show_All.text.toString().equals("0"))
            {
                Show_All.setText("9")
            }
            else {
                var Numbers = Show_All.text.toString().plus("9")
                Show_All.setText(Numbers)
            }
        }


    }
}