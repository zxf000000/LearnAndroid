package com.example.layouttest

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.title.view.*

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context,attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)

        val back_button = findViewById<Button>(R.id.back_button)
        val editButton = findViewById<Button>(R.id.title_edit)

        back_button.setOnClickListener{
            if (context is Activity) {
                context.finish()
            }
        }

        editButton.setOnClickListener {

            Toast.makeText(context, "you click edit button", Toast.LENGTH_SHORT).show()
        }
    }
}