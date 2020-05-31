package com.example.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class PictureManager : AppCompatActivity(), View.OnClickListener { //add View.OnClickListener implementation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_manager)
        val microphone: ImageView = findViewById(R.id.imageView3)
        microphone.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        Toast.makeText(applicationContext, R.string.onClick,LENGTH_SHORT ).show()
    }

    fun goBack(view: View){
        this.finish()
    }
}
