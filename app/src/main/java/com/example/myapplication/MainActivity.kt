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

        val clist1 = arrayOf("USD", "RUB", "EUR")
        val aa1 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, clist1)

        spinner1.adapter = aa1

        val clist2 = arrayOf("RUB", "USD", "EUR")
        val aa2 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, clist2)

        spinner2.adapter = aa2

        button.setOnClickListener {
            val a: Double = enter.text.toString().toDouble()
            val c1: String = spinner1.selectedItem.toString()
            val c2: String = spinner2.selectedItem.toString()

            if (a < 0.0) {
                result.text = "Error"
            }

            else if ((c1 == "USD" && c2 == "USD") || (c1 == "RUB" && c2 == "RUB") || (c1 == "EUR" && c2 == "EUR")) {
                result.text = a.toString()
            }

            else if (c1 == "USD" && c2 == "RUB") {
                val a1: Double = a*70.21
                result.text = a1.toString()
            }

            else if (c1 == "USD" && c2 == "EUR") {
                val a2: Double = a/1.15
                result.text = a2.toString()
            }

            else if (c1 == "RUB" && c2 == "USD") {
                val a3: Double = a/70.26
                result.text = a3.toString()
            }

            else if (c1 == "RUB" && c2 == "EUR") {
                val a4: Double = a/78.95
                result.text = a4.toString()
            }

            else if (c1 == "EUR" && c2 == "USD") {
                val a5: Double = a*1.12
                result.text = a5.toString()
            }

            else {
                val a6: Double = a*78.92
                result.text = a6.toString()
            }


        }
    }
}