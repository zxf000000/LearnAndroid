package com.example.uibestpractice

import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import com.example.uibestpractice.Message as Message


class MessageAdapter(val items: List<Message>): RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    class MessageViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        var msgLayout: LinearLayout? = null
        var msg: TextView? = null

        init {
            msgLayout = view.findViewById(R.id.left_layout)
            msg = view.findViewById(R.id.msg_text_view)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.msg_item, parent, false)
        return MessageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = items[position]
        holder.msg?.text = message.content
        Log.d("111","渲染 $position")
    }
}