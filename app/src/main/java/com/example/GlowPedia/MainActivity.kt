package com.example.GlowPedia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        // Membuat data item dengan harga dan stok
        val itemList = listOf(
            ItemList("Cetaphil", "Gentle Skin Cleanser", R.drawable.p1, 120000.0, 15),
            ItemList("Neutrogena", "Hydro Boost Water Gel", R.drawable.p2, 250000.0, 20),
            ItemList("The Body Shop", "Tea Tree Oil", R.drawable.p3, 150000.0, 10),
            ItemList("L'Oréal Paris", "Revitalift Bright Reveal Brightening Peel Pads", R.drawable.p4, 200000.0, 8),
            ItemList("Nivea", "MicellAIR Skin Breathe", R.drawable.p5, 100000.0, 25),
            ItemList("Kiehl's", "Calendula Deep Cleansing Foaming Face Wash", R.drawable.p6, 350000.0, 5),
            ItemList("Avene", "Cicalfate Restorative Skin Cream", R.drawable.p7, 280000.0, 12),
            ItemList("Olay", "Regenerist Micro-Sculpting Cream", R.drawable.p8, 300000.0, 18),
            ItemList("Clinique", "Moisture Surge 72-Hour Auto-Replenishing Hydrator", R.drawable.p9, 400000.0, 6),
            ItemList("La Roche-Posay", "Effaclar Purifying Foaming Gel", R.drawable.p10, 220000.0, 14)
        )

        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter
    }
}
