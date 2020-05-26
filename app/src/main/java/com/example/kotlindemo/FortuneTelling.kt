package com.example.kotlindemo

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AlertDialog
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
        // var result = "大吉"
        val result:String = resources.getStringArray(R.array.Fortune).toList().shuffled().take(1)[0]

        textView.text = result
        Snackbar.make(
            findViewById(R.id.myCoordinatorLayout),
            result,
            Snackbar.LENGTH_SHORT
        ).show()
        Toast.makeText(applicationContext, result,LENGTH_SHORT ).show()


        val builder = AlertDialog.Builder(this)
        builder.setMessage(result)
            .setPositiveButton("確定",
                DialogInterface.OnClickListener { dialog, id ->
                    // User confirm the dialog
                    print("確定")
                })
            .setNegativeButton("取消",
                DialogInterface.OnClickListener { dialog, id ->
                    // User cancelled the dialog
                    print("取消")
                })
        // Create the AlertDialog object and return it
        builder.create().show()
    }
    fun goBack(view: View){
        this.finish()
    }
}
