package com.nkodem.progressbar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val SortujButt = findViewById<Button>(R.id.SortujButt)
        val IleRazy = findViewById<EditText>(R.id.IloscRazy).text.toString().toInt()
        val Elementy = findViewById<EditText>(R.id.Elementy).text.toString().toInt()
        val tab: MutableList<Int> = mutableListOf()

        var progressstatus = 0

        wypelnianie(Elementy, tab)
    }

    fun wypelnianie(Elementy : Int, tab: MutableList<Int>){
        for (i in 0 until Elementy)
        {
            val liczba = Random.nextInt()
            tab.add(liczba)
        }
    }

}

