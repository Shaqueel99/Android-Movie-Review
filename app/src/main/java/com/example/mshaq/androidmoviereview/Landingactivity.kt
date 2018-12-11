package com.example.mshaq.androidmoviereview

import android.app.ProgressDialog.show
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.*
import com.example.mshaq.androidmoviereview.R.id.all


import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess
import android.widget.TextView
import android.widget.Toast
import android.view.ContextMenu
import android.view.MenuItem


open class Landingactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landingpage)

        val textView = findViewById<TextView>(R.id.text_view)

        registerForContextMenu(textView)
    }
    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when (item?.getItemId()) {
            R.id.option_1 -> {
                val Addmovie = Intent(this, MainActivity::class.java)

                startActivity(Addmovie)
            }

        }
        return super.onContextItemSelected(item)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.contextmenulandpage, menu)

    }


}

