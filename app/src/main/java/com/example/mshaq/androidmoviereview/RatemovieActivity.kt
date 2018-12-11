package com.example.mshaq.androidmoviereview

import android.app.Activity
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
import android.view.Menu
import android.view.MenuItem
import com.example.mshaq.androidmoviereview.R.layout.viewmovie
import kotlinx.android.synthetic.main.movierating.*
import kotlinx.android.synthetic.main.viewmovie.*
import java.util.jar.Attributes


open class RatemovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movierating)


        val actionBar = supportActionBar

        actionBar!!.title = "Movie Rater"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menusubmitrating, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.menuSubmit) {
            if (userText.getText().toString().isBlank()) {
                userText.setError("Field empty")
            }


            if( userText.getText().toString().isNotBlank()){
                ViewmovieActivity()
                }
        }

            return super.onOptionsItemSelected(item)
        }


    private fun ViewmovieActivity(){
        val enteruserrate = userText.text
        val stars = ratingBar.rating
        val userrate = enteruserrate.toString()
        val review = Intent(this, ViewmovieActivity::class.java)
        review.putExtra("textRate",userrate)
        review.putExtra("starRate",stars)

        setResult(Activity.RESULT_OK,review)
        finish()
    }
    }


