package com.example.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_fortune_telling.*

class FortuneTelling : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fortune_telling)
    }
    fun predict(view: View){
        var result = "大吉"
        textView.text = result
        Toast.makeText(applicationContext, result,LENGTH_SHORT ).show()
    }
    fun goBack(view: View){
        this.finish()
    }
}
