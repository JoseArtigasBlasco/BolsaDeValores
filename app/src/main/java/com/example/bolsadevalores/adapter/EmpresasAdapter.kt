package com.example.bolsadevalores.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bolsadevalores.R
import com.example.bolsadevalores.data.DataclasEmpresas


class EmpresasAdapter (private val empresasList: List<DataclasEmpresas>, private val onClickListener:(DataclasEmpresas)-> Unit):
    RecyclerView.Adapter<EmpresasViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmpresasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return EmpresasViewHolder(layoutInflater.inflate(R.layout.item_empresas, parent, false))
    }



    override fun getItemCount(): Int = empresasList.size




    override fun onBindViewHolder(holder: EmpresasViewHolder, position: Int) {
        val item = empresasList[position]
        holder.render(item, onClickListener)
    }
}