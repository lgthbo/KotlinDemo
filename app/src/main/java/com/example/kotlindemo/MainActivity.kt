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
    fun buttonClick(view: View){
        editText3.setText( (editText.text.toString().toDouble() + (editText2.text).toString().toDouble()).toString() )
    }
    fun changePageToFortune(view: View){
        var myIntent = Intent(this,FortuneTelling::class.java)
        startActivity(myIntent)
    }
}
