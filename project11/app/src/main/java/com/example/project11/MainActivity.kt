package com.example.project11

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopapp.adapter.ProductAdapter
import com.example.shopapp.model.Product

class MainActivity : AppCompatActivity() {

    private val productList = listOf(
            Product(R.drawable.item1, "Item 1", "Description 1", "$10"),
            Product(R.drawable.item2, "Item 2", "Description 2", "$20"),
            Product(R.drawable.item3, "Item 3", "Description 3", "$30")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ProductAdapter(this, productList)
    }
}