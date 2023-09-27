package com.example.bolsadevalores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bolsadevalores.databinding.ActivityMainBinding
import com.example.bolsadevalores.iu.pantallas.Bonus
import com.example.bolsadevalores.iu.pantallas.Cartera
import com.example.bolsadevalores.iu.pantallas.Diagrama
import com.example.bolsadevalores.iu.pantallas.Empresas
import com.example.bolsadevalores.iu.pantallas.Informacion

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        opcionesMenu()
    }

    private fun opcionesMenu() {

        binding.informacion.setOnClickListener() {
            val intent = Intent(this, Informacion::class.java)
            startActivity(intent)

        }


        binding.cartera.setOnClickListener() {
            val intent = Intent(this, Cartera::class.java)
            startActivity(intent)

        }


        binding.empresas.setOnClickListener() {
            val intent = Intent(this, Empresas::class.java)
            startActivity(intent)

        }


        binding.diagrama.setOnClickListener() {
            val intent = Intent(this, Diagrama::class.java)
            startActivity(intent)

        }


        binding.apuestas.setOnClickListener() {
            val intent = Intent(this, Bonus::class.java)
            startActivity(intent)

        }


    }
}