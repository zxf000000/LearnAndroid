package com.example.uibestpractice

import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter(val items: List<Message>): RecyclerView.Adapter<Message>(items) {


    class MessageViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
        private var msgLayout: LinearLayout?
        private var msg: TextView?
        init {
            msgLayout = LayoutInflater.from(itemView.context).inflate(R.layout.msg_item, parent, false) as LinearLayout?

        }
    }
}