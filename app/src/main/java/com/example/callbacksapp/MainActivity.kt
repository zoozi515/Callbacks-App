package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val TAG = "Activity #1"
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate:")
        Toast.makeText(this,"$TAG - OnCreate",Toast.LENGTH_SHORT).show()


        button = findViewById(R.id.goToActivity2_button)
        button.setOnClickListener(object :  View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity,MainActivity2::class.java)
                startActivity(intent)
            }
        })
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
        Toast.makeText(this,"$TAG - onStart",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
        Toast.makeText(this,"$TAG - onResume",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
        Toast.makeText(this,"$TAG - onPause",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
        Toast.makeText(this,"$TAG - onStop",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
        Toast.makeText(this,"$TAG - onDestroy",Toast.LENGTH_SHORT).show()
    }
}