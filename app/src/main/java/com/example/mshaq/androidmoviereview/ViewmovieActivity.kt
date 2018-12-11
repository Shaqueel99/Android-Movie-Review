package com.example.mshaq.androidmoviereview

import android.app.Activity
import android.app.ProgressDialog.show
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager

import android.view.View
import android.widget.*
import com.example.mshaq.androidmoviereview.R.id.all



import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess
import android.widget.TextView
import android.widget.Toast
import android.view.ContextMenu
import android.view.MenuItem
import com.example.mshaq.androidmoviereview.R.id.text
import com.example.mshaq.androidmoviereview.R.layout.viewmovie
import kotlinx.android.synthetic.main.viewmovie.*
import java.util.jar.Attributes


open class ViewmovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.viewmovie)
        val textView = findViewById<TextView>(R.id.context_menu)
        registerForContextMenu(textView)
        val name = intent.getStringExtra("name")
        titleText2.text = name
        val description = intent.getStringExtra("description")
        titleText3.text = description
        val language = intent.getStringExtra("language")
        titleText4.text = language
        val releasedate = intent.getStringExtra("releasedate")
        titleText5.text = releasedate
        val nsfaa = intent.getStringExtra("nsfaa")
        val violence = intent.getStringExtra("violence")
        val badlang = intent.getStringExtra("badlang")
        titleText6.text = nsfaa  + violence  + badlang


        val actionBar = supportActionBar

        actionBar!!.title = "Movie Rater"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.contextmenuaddreview, menu)
    }
    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when (item?.getItemId()) {
            R.id.contextmenu -> {
                val rate = Intent(this, RatemovieActivity::class.java)
                startActivityForResult(rate,1)

            }
        }
        return super.onContextItemSelected(item)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?){

        if (requestCode == 1){
            if (resultCode == Activity.RESULT_OK){

                val textRate = data!!.getStringExtra("textRate")
                context_menu.text = textRate
                val starRate = data!!.getFloatExtra("starRate",0.5.toFloat())
                stars.visibility = View.VISIBLE
               stars.rating = starRate

            }
        }
    }



    }




