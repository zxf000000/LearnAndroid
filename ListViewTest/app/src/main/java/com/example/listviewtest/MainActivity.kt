package com.example.listviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var fruits = mutableListOf<Fruit>()

    fun initFruits() {
        for (i in 0..100) {
            fruits.add(Fruit("apple", R.drawable.apple))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFruits()
        val fruitAdapter = FruitAdapter(this, R.layout.fruit_item, fruits)
        val listView = findViewById<ListView>(R.id.List_view)
        listView.adapter = fruitAdapter

        // 点击事件
        listView.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(this, "tap index : $position", Toast.LENGTH_SHORT).show()
        }
    }
}
