package com.example.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
