package com.itsmad.insideoutquizui

import FirstQuestionFragment
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.itsmad.insideoutquizui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: MainActivity? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val addFragmentButton = findViewById<Button>(R.id.nextQuestion)

        //Aggiungi il fragment dell'About
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainer, FirstQuestionFragment())
            .commit()


        addFragmentButton.setOnClickListener {

            //Aggiungi il fragment dei Contacts
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainer, SecondQuestionFragment())
                .addToBackStack(null)
                .commit()

        }
    }
}