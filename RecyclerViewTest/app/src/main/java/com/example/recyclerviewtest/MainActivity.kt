package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import java.lang.StringBuilder
import java.util.*

class MainActivity : AppCompatActivity() {

    private var fruits: MutableList<Fruit> = mutableListOf()
    private fun initFruits() {
        for (i in 0..99) {
            fruits.add(Fruit(randomName("apple"), R.drawable.apple))
        }
    }

    private fun randomName(name: String): String {
        val random = Random()
        val length = random.nextInt(20) + 1
        var str = StringBuilder()
        for (i in 0..length) {
            str.append(name)
        }
        return str.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruits()
        val recyclerView = findViewById<RecyclerView>(R.id.recycle_view)
        // 瀑布流
        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
//        val layoutManager = LinearLayoutManager(this)
//        // 水平
//        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
//        recyclerView.layoutManager = layoutManager
        // 垂直
//        recyclerView.layoutManager = layoutManager
        val fruitAdapter = FruitAdapter(fruits)
        recyclerView.adapter = fruitAdapter
    }
}
