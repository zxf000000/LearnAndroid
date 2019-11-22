package com.example.uibestpractice

import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import com.example.uibestpractice.Message as Message


class MessageAdapter(val messages: List<Message>): RecyclerView.Adapter<MessageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.msg_item, parent, false)
        val viewHolder = ViewHolder(view)

        return viewHolder
    }

    override fun getItemCount(): Int {
        return messages.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = messages[position]
        holder.textView.text = fruit.content



    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(
        itemView
    ) {
        var textView: TextView = itemView.findViewById(R.id.msg_text_view)
    }
}