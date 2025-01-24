package com.example.project11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.project11.model.Product

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Ambil data produk dari intent
        val product = intent.getSerializableExtra("product") as Product

        // Hubungkan view dengan ID di layout
        val detailImage = findViewById<ImageView>(R.id.detailImage)
        val detailTitle = findViewById<TextView>(R.id.detailTitle)
        val detailDescription = findViewById<TextView>(R.id.detailDescription)
        val detailPrice = findViewById<TextView>(R.id.detailPrice)
        val addToCartButton = findViewById<Button>(R.id.addToCartButton)
        val shareButton = findViewById<Button>(R.id.shareButton)
        val viewLocationButton = findViewById<Button>(R.id.viewLocationButton)

        // Set data ke view
        detailImage.setImageResource(product.imageResId)
        detailTitle.text = product.title
        detailDescription.text = product.description
        detailPrice.text = "Price: ${product.price}"

        // Tombol Tambah ke Keranjang
        addToCartButton.setOnClickListener {
            // Logika untuk menambahkan ke keranjang
        }

        // Tombol Share
        shareButton.setOnClickListener {
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Check out this product: ${product.title}")
                type = "text/plain"
            }
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }

        // Tombol Lihat Lokasi
        viewLocationButton.setOnClickListener {
            // Logika untuk membuka peta lokasi
        }
    }
}
