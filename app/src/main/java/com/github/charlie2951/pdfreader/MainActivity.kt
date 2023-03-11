package com.github.charlie2951.pdfreader

import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button click
        val button1: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val str1="sample1.pdf"
        val str2="sample2.pdf"
        button1.setOnClickListener {
            //your implementation goes here
            //val textView: TextView = findViewById(R.id.textView)
            //textView.text = "Button clicked!"
            val intent=Intent(applicationContext,SecondActivity::class.java)
            intent.putExtra("message_key", str1)
            startActivity(intent)

        }
        button2.setOnClickListener {
            //your implementation goes here
            //val textView: TextView = findViewById(R.id.textView)
            //textView.text = "Button clicked!"
            val intent=Intent(applicationContext,SecondActivity::class.java)
            intent.putExtra("message_key", str2)
            startActivity(intent)

        }
    }


}