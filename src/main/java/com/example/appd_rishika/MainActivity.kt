package com.example.appd_rishika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val txt:EditText=findViewById(R.id.name)
        val roll:EditText=findViewById(R.id.age)
        val btn: Button =findViewById(R.id.btn_submit)
        btn.setOnClickListener {
            val str1: String = txt.text.toString()
            val str2: String = roll.text.toString()


            if (str1.equals("", ignoreCase = true) ) {
                Toast.makeText(this, "Please Enter Name", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Hey $str1, Go Corona Go", Toast.LENGTH_SHORT).show()
            }
        }
        }
    }
