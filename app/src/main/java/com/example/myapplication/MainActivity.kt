package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.math.*
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enter: EditText = findViewById(R.id.enter)
        val spinner1: Spinner = findViewById(R.id.spinner1)
        val spinner2: Spinner = findViewById(R.id.spinner2)
        val button: Button = findViewById(R.id.button)
        val result: TextView = findViewById(R.id.result)

        val clist1 = arrayOf("USD", "RUB", "EUR", "GBP")
        val aa1 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, clist1)

        spinner1.adapter = aa1

        val clist2 = arrayOf("RUB", "USD", "EUR", "GBP")
        val aa2 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, clist2)

        spinner2.adapter = aa2

        button.setOnClickListener {
            val a: Double = enter.text.toString().toDouble()
            val c1: String = spinner1.selectedItem.toString()
            val c2: String = spinner2.selectedItem.toString()

            if (a < 0.0) {
                result.text = "Error"
            }

            else if ((c1 == "USD" && c2 == "USD") || (c1 == "RUB" && c2 == "RUB") || (c1 == "EUR" && c2 == "EUR") || (c1 == "GBP" && c2 == "GBP")) {
                result.text = a.toString()
            }

            else if (c1 == "USD" && c2 == "RUB") {
                val a1: Double = a*70.21
                result.text = a1.toString()
            }

            else if (c1 == "USD" && c2 == "EUR") {
                val a1: Double = a/1.15
                result.text = a1.toString()
            }

            else if (c1 == "USD" && c2 == "GBP") {
                val a1: Double = a/1.26
                result.text = a1.toString()
            }

            else if (c1 == "RUB" && c2 == "USD") {
                val a1: Double = a/70.26
                result.text = a1.toString()
            }

            else if (c1 == "RUB" && c2 == "EUR") {
                val a1: Double = a/78.95
                result.text = a1.toString()
            }

            else if (c1 == "RUB" && c2 == "GBP") {
                val a1: Double = a/87.7
                result.text = a1.toString()
            }

            else if (c1 == "EUR" && c2 == "USD") {
                val a1: Double = a*1.12
                result.text = a1.toString()
            }

            else if (c1 == "EUR" && c2 == "RUB"){
                val a1: Double = a*78.96
                result.text = a1.toString()
            }

            else if (c1 == "EUR" && c2 == "GBP"){
                val a1: Double = a/1.11
                result.text = a1.toString()
            }

            else if (c1 == "GBP" && c2 == "EUR"){
                val a1: Double = a*1.12
                result.text = a1.toString()
            }

            else if (c1 == "GBP" && c2 == "USD"){
                val a1: Double = a*1.26
                result.text = a1.toString()
            }

            else {
                val a1: Double = a*87.7
                result.text = a1.toString()
            }



        }
    }
}