package com.example.bolsadevalores.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.bolsadevalores.data.DataclasEmpresas
import com.example.bolsadevalores.databinding.ItemEmpresasBinding


class EmpresasViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemEmpresasBinding.bind(view)

    fun render (empresasModel: DataclasEmpresas, onClickListener: (DataclasEmpresas) -> Unit){

        binding.tvnombreEmpresa.text = empresasModel.nombre
        binding.tvcotizacionValor.text = empresasModel.cotizacion.toString()
        binding.tvIncDecValor.text = empresasModel.incremento.toString()
        binding.tvporcentajeValor.text = empresasModel.porcentaje.toString()


        itemView.setOnClickListener(){onClickListener(empresasModel)

        }


    }
}