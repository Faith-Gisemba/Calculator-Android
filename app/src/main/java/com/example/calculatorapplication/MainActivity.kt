package com.example.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    lateinit var tiltitle: TextView
    lateinit var tilfirst: TextView
    lateinit var tilsecond: TextView
    lateinit var tiloutput: TextView
    lateinit var tilbutton1: Button
    lateinit var tilbtn2: Button
    lateinit var tilbtn3: Button
    lateinit var tilbtn4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilfirst = findViewById(R.id.tilfirst)
        tilsecond = findViewById(R.id.tilbtn2)
        tiloutput = findViewById(R.id.tiloutput)
        sumUpNumbers()
        minusNumbers()
        productOfNumbers()
        divideNumbers()
    }
    fun sumUpNumbers() {
        var first = findViewById<TextView>(R.id.tilfirst)
        var second = findViewById<TextView>(R.id.tilseconnd)
        var button = findViewById<Button>(R.id.tilbutton1)
        button.setOnClickListener {
            var sumfirst = first.text.toString().toInt()
            var sumsecond = second.text.toString().toInt()
            var output = sumfirst + sumsecond
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }
    fun minusNumbers() {
        var first = findViewById<TextView>(R.id.tilfirst)
        var second=findViewById<TextView>(R.id.tilseconnd)
        var button = findViewById<Button>(R.id.tilbtn4)
        button.setOnClickListener {
            var sub = first.text.toString().toInt()
            var sub2 = second.text.toString().toInt()
            var output = sub - sub2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }
    fun productOfNumbers() {
        var first = findViewById<TextView>(R.id.tilfirst)
        var second = findViewById<TextView>(R.id.tilseconnd)
        var button = findViewById<Button>(R.id.tilbtn2)
        button.setOnClickListener {
            var multi = first.text.toString().toInt()
            var multi2 = second.text.toString().toInt()
            var output = multi * multi2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }
    fun divideNumbers() {
        var first = findViewById<TextView>(R.id.tilfirst)
        var second = findViewById<TextView>(R.id.tilseconnd)
        var button = findViewById<Button>(R.id.tilbtn3)
        button.setOnClickListener {
            var divide = first.text.toString().toInt()
            var divide2 = second.text.toString().toInt()
            var output = divide % divide2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }
}

