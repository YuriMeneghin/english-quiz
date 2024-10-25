package com.itsmad.insideoutquizui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

// Crea un'istanza del tuo fragment
        val myFragment = FirstQuestionFragment()

// Aggiungi il fragment al container
        fragmentTransaction.add(R.id.fragmentContainer, myFragment)
// Oppure sostituisci il fragment esistente
// fragmentTransaction.replace(R.id.fragment_container, myFragment)

        fragmentTransaction.commit()
    }
}