package com.example.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.MotionEventCompat
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var heartImage = findViewById<View>(R.id.imageView)

        heartImage.setOnTouchListener { _, event ->
            Toast.makeText(applicationContext, event.toString(), Toast.LENGTH_SHORT).show()
            // Log.i("Event String", event.toString())
            if(event.action == MotionEvent.ACTION_DOWN)
                Log.i("Event String", event.toString())
            true
        }
    }




    fun changePageToFortune(view: View){
        var myIntent = Intent(this,FortuneTelling::class.java)
        startActivity(myIntent)
    }
    fun goPic(view: View){
        var myIntent = Intent(this,PictureManager::class.java)
        startActivity(myIntent)
    }
    fun goAdd(view: View){
        var myIntent = Intent(this,Plus::class.java)
        startActivity(myIntent)
    }
}
