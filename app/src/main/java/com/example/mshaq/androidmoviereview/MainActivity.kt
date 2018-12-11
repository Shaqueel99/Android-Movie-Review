package com.example.mshaq.androidmoviereview

import android.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.view.Menu
import android.view.MenuItem
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton

import android.content.Intent
import android.view.View
import android.widget.*
import com.example.mshaq.androidmoviereview.R.id.all
import com.example.mshaq.androidmoviereview.R.layout.viewmovie


import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess


open class MainActivity : AppCompatActivity() {


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menuadd, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.menuAdd) {




            if (editText2.getText().toString().isBlank()) {
                editText2.setError("Field empty")

            }

            if (editText3.getText().toString().isBlank()) {
                editText3.setError("Field empty")

            }

            if (editText5.getText().toString().isBlank()) {
                editText5.setError("Field empty")

            }

            if (editText5.getText().toString().isNotBlank() and editText2.getText().toString().isNotBlank() and editText3.getText().toString().isNotBlank()) {
                  ViewmovieActivity()
            }
        } else if (item?.itemId == R.id.menuClear) {
            editText2.text.clear()
            editText3.text.clear()
            editText5.text.clear()
            checkbox_nsfaa.isChecked = false
            checkbox_vio.isChecked = false
            checkbox_language.isChecked = false
            checkbox_language.visibility = View.GONE
            checkbox_vio.visibility = View.GONE
            radio_eng.isChecked = true

        }


            return super.onOptionsItemSelected(item)
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar

        actionBar!!.title = "Movie Rater"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    open fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked
             val langname : RadioButton = findViewById(R.id.langname)

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radio_eng ->
                    if (checked) {
                     langname.text = "English"

                    }
                R.id.radio_chi ->
                    if (checked) {
                      langname.text = "Chinese"
                    }
                R.id.radio_malay ->
                    if (checked) {
                        langname.text = "Malay"
                    }
                R.id.radio_tamil ->
                    if (checked) {
                        langname.text = "Tamil"
                    }
            }
        }
    }
    open fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            val checkbox_vio = findViewById(R.id.checkbox_vio) as CheckBox
            val checkbox_language = findViewById(R.id.checkbox_language) as CheckBox
            val checknsfaa : CheckBox = findViewById(R.id.checknsfaa)
            val checkvio : CheckBox = findViewById(R.id.checkvio)
            val checkbadlang : CheckBox = findViewById(R.id.checkbadlang)


            when (view.id) {
                R.id.checkbox_nsfaa -> {
                    if (checked) {
                        checkbox_vio.setVisibility(View.VISIBLE);
                        checkbox_language.setVisibility(View.VISIBLE);
                        checknsfaa.text = "No"
                    } else {
                        checkbox_vio.setVisibility(View.INVISIBLE);
                        checkbox_language.setVisibility(View.INVISIBLE);
                        checknsfaa.text = "Yes"
                    }
                }
                R.id.checkbox_vio -> {
                    if (checked) {
                        checkvio.text = "(Violence)"

                    } else {
                        checkvio.text = ""
                    }
                }
                R.id.checkbox_language -> {
                    if (checked) {
                        checkbadlang.text = "(Language)"
                    } else {
                        checkbadlang.text = ""

                    }
                }

            }
        }
    }
private fun ViewmovieActivity(){
    val entername = editText2.text
    val name = entername.toString()
    val enterdescription = editText3.text
    val description = enterdescription.toString()
    val enterlang = langname.text
    val lang = enterlang.toString()
    val enterdate = editText5.text
    val date = enterdate.toString()
    val nsfaacheck = checknsfaa.text
    val nsfaa = nsfaacheck.toString()
    val viocheck = checkvio.text
    val vio = viocheck.toString()
    val badlangcheck = checkbadlang.text
    val badlang = badlangcheck.toString()

    val viewmovie = Intent(this,ViewmovieActivity::class.java)
    viewmovie.putExtra("name",name)
    viewmovie.putExtra("description",description)
    viewmovie.putExtra("language",lang)
    viewmovie.putExtra("releasedate",date)
    viewmovie.putExtra("nsfaa",nsfaa)
    viewmovie.putExtra("violence",vio)
    viewmovie.putExtra("badlang",badlang)
    startActivity(viewmovie)
}

}



