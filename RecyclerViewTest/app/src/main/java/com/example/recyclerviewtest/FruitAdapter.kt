package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(val fruitList: List<Fruit>): RecyclerView.Adapter<FruitAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent, false)
        val viewHolder = ViewHolder(view)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return fruitList.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.textName.text = fruit.name
        holder.imgView.setImageResource(fruit.imgId)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(
        itemView
    ) {
        var imgView: ImageView
        var textName: TextView
        init {
            imgView = itemView.findViewById(R.id.fruit_img)
            textName = itemView.findViewById(R.id.fruit_name)
        }
    }
}