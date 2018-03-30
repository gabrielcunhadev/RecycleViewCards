package com.gabrielcunha.recycleviewcards.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.gabrielcunha.recycleviewcards.R
import com.gabrielcunha.recycleviewcards.produto.Produto


/**
 * Created by GABRIEL on 30/03/2018.
 */

class ProdutoAdapter (val listProduto : ArrayList<Produto>) : RecyclerView.Adapter<ProdutoAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val produto : Produto = listProduto[position]
        holder?.id?.text = produto.id.toString()
        holder?.nome?.text = produto.nome
    }

    override fun getItemCount(): Int {
        return listProduto.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.produto_list, parent, false)
        return ViewHolder(v)
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val id = view.findViewById<TextView>(R.id.tvId) as TextView

        val nome = view.findViewById<TextView>(R.id.tvNome) as TextView
    }

}

