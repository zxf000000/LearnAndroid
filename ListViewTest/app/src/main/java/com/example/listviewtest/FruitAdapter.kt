package com.example.listviewtest

import android.annotation.SuppressLint
import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FruitAdapter(context: Context, resourceId: Int, objects: List<Fruit> ): ArrayAdapter<Fruit>(context, resourceId, objects) {
    private var resId: Int = 0
    init {
        resId = resourceId
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val fruit = getItem(position)
        var view: View?
        var viewHolder: ViewHolder?
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(resId, parent, false)
            viewHolder = ViewHolder(null,null)
            viewHolder.fruitImage =  view.findViewById<ImageView>(R.id.fruit_img)
            viewHolder.fruitName = view.findViewById<TextView>(R.id.fruit_name)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder?
        }
        if (view != null) {
            viewHolder?.fruitImage?.setImageResource(fruit?.imageId ?: 0)
            viewHolder?.fruitName?.text = fruit?.name ?: ""
            return view
        }
        return  super.getView(position, convertView, parent)
    }

    class ViewHolder(var fruitName: TextView?, var fruitImage: ImageView?)
}