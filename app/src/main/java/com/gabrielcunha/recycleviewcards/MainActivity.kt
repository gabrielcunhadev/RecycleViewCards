package com.gabrielcunha.recycleviewcards

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.gabrielcunha.recycleviewcards.R.id.recyclerView
import com.gabrielcunha.recycleviewcards.adapter.ProdutoAdapter
import com.gabrielcunha.recycleviewcards.produto.Produto
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerV : RecyclerView = recyclerView

        recyclerV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val produtos = ArrayList<Produto>()

        produtos.add(Produto(5, "Camiseta Nerd JavaScript" ))
        produtos.add(Produto(6, "Camiseta Gane of Thrones" ))
        produtos.add(Produto(7, "Camiseta Alan Turing" ))
        produtos.add(Produto(8, "Camiseta X-Men" ))
        produtos.add(Produto(9, "Camiseta Jesus Programador" ))
        produtos.add(Produto(10, "Camiseta Código Morse" ))

        var adapter = ProdutoAdapter(produtos)

        recyclerV.adapter = adapter
    }
}
