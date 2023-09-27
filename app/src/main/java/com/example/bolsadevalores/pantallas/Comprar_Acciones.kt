package com.example.bolsadevalores.pantallas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.bolsadevalores.databinding.ActivityComprarAccionesBinding
import java.text.DecimalFormat

class Comprar_Acciones : AppCompatActivity() {

    private val compraAcciones by viewModels<CompraAccionesViewModel>()

    private var valorInicial: Int= 0

    private lateinit var binding: ActivityComprarAccionesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComprarAccionesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initListeners()
    }

    private fun initListeners() {

        //PASAR DATOS
        val bundle = intent.extras
        val empresa = bundle?.getString("Empresa")
        val cotizacion = bundle?.getDouble("Cotizacion")

        binding.tvNombreEmpresa.text = empresa
        binding.tvcotizacionCompra.text = cotizacion.toString()



        //DESLIZADOR
        binding.rsdeslizadorInversion.addOnChangeListener{_, value, _ ->
            val df = DecimalFormat("#.##")
            valorInicial = df.format(value).toInt()
            binding.inversionTexto.text = "$valorInicial"




        }
    }
}