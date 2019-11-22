package com.example.uibestpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var msgList: MutableList<Message>? = mutableListOf(Message("1111"))
    private var editText: EditText? = null
    private var sendButton: Button? = null
    private var recyclerView: RecyclerView? = null
    private var msgAdapter: MessageAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editText = findViewById(R.id.edit_text)
        sendButton = findViewById(R.id.send_button)
        recyclerView = findViewById(R.id.recycler_view)
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView?.layoutManager = layoutManager
        msgAdapter = MessageAdapter(msgList ?: mutableListOf())
        recyclerView?.adapter = msgAdapter
        sendButton?.setOnClickListener {
            val msg = editText?.text.toString()
            if (msg.isNotEmpty()) {
                val message = Message(msg)
                msgList?.add(message)
                msgAdapter?.notifyItemInserted((msgList?.count() ?: 0) - 1)

                recyclerView?.scrollToPosition((msgList?.count() ?: 0) - 1)
                editText?.setText("")
            }

        }



    }
}
