package com.example.kotlindemo

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_plus.*

class Plus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plus)
        readData()
    }
    fun buttonClick(view: View){
        ans.setText( (x.text.toString().toDouble() + (y.text).toString().toDouble()).toString() )
        saveData()
    }
    fun goBack(view: View){
        this.finish()
    }
    private fun saveData(){
        /*val sharedPref = getSharedPreferences(Context.MODE_PRIVATE) ?: return
        sharedPref.edit()*/

        val settings = getSharedPreferences("adderData", 0)
        settings.edit()
            .putString("x", x.text.toString())
            .putString("y", y.text.toString())
            .putString("ans", ans.text.toString())
            .apply()
    }
    private fun readData() {
        val settings = getSharedPreferences("adderData", 0)
        x.setText(settings.getString("x",""))
        y.setText(settings.getString("y",""))
        ans.setText(settings.getString("ans",""))
    }
}
