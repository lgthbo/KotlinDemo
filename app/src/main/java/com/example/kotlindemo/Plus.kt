package com.example.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_plus.*

class Plus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plus)
    }
    fun buttonClick(view: View){
        editText3.setText( (editText.text.toString().toDouble() + (editText2.text).toString().toDouble()).toString() )
    }
    fun goBack(view: View){
        this.finish()
    }
}
