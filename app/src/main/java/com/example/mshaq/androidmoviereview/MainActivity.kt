package com.example.mshaq.androidmoviereview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.*


import kotlinx.android.synthetic.main.activity_main.*


open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt.setOnClickListener {
            val editText2 = findViewById(R.id.editText2) as EditText
            val editText3 = findViewById(R.id.editText3) as EditText
            val editView5 = findViewById(R.id.editText5) as EditText
            val langname : RadioButton = findViewById(R.id.langname)
            Toast.makeText(
                this,
                "Title = " + editText2.text + "\n" + "Overview = " + editText3.text + "\n" + "Language = " + langname.text + "\n" + "Release Date = " + editView5.text,
                Toast.LENGTH_LONG
            ).show()

        }
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


            when (view.id) {
                R.id.checkbox_nsfaa -> {
                    if (checked) {
                        checkbox_vio.setVisibility(View.VISIBLE);
                        checkbox_language.setVisibility(View.VISIBLE);
                    } else {
                        checkbox_vio.setVisibility(View.INVISIBLE);
                        checkbox_language.setVisibility(View.INVISIBLE);
                    }
                }
                R.id.checkbox_vio -> {
                    if (checked) {

                    } else {

                    }
                }
                R.id.checkbox_language -> {
                    if (checked) {

                    } else {

                    }
                }

            }
        }
    }


}
