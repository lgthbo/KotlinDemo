package com.example.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_picture_manager.*

class PictureManager : AppCompatActivity(), View.OnClickListener { //add View.OnClickListener implementation
    var currentImg : Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_manager)
        val hotdog: ImageView = findViewById(R.id.imageView3)
        hotdog.setOnClickListener(this)

        button8.setOnTouchListener { _, event ->
            if(event.action == MotionEvent.ACTION_DOWN)
                button8.setBackgroundResource(R.drawable.hotdog2)
            else
                button8.setBackgroundResource(R.drawable.hotdog)
            true
        }
    }

    override fun onClick(v: View?) {
        val hotdog: ImageView = findViewById(R.id.imageView3)
        if (currentImg == 1)
        {
            hotdog.setImageResource(R.drawable.hotdog2)
            currentImg = 2
        }
        else
        {
            hotdog.setImageResource(R.drawable.hotdog)
            currentImg = 1
        }
        Toast.makeText(applicationContext, R.string.onClick,LENGTH_SHORT ).show()
    }

    fun goBack(view: View){
        this.finish()
    }
}
