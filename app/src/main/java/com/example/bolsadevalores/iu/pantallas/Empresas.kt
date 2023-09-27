package com.example.bolsadevalores.iu.pantallas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bolsadevalores.adapter.EmpresasAdapter
import com.example.bolsadevalores.data.DataclasEmpresas
import com.example.bolsadevalores.data.EmpresasProvider
import com.example.bolsadevalores.iu.view.MainActivity
import com.example.bolsadevalores.databinding.ActivityEmpresasBinding

class Empresas : AppCompatActivity() {

    private lateinit var binding: ActivityEmpresasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmpresasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        initToolbar()

    }


    private fun initToolbar() {
        binding.custonToolbar.tvback.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this)

        binding.recyclerEmpresas.layoutManager = manager
        binding.recyclerEmpresas.adapter = EmpresasAdapter(EmpresasProvider.empresaslist) { empresa ->
            onItemSelected(
                empresa
            )
        }
    }

    private fun onItemSelected(empresa: DataclasEmpresas) {
        Toast.makeText(this, empresa.nombre, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, Comprar_Acciones::class.java)
        intent.putExtra("Empresa", empresa.nombre)
        intent.putExtra("Cotizacion", empresa.cotizacion)
        startActivity(intent)


    }

}