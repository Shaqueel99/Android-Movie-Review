package com.example.mshaq.androidmoviereview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.*
import com.example.mshaq.androidmoviereview.R.id.all


import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess


open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt.setOnClickListener {

        val editText2 = findViewById(R.id.editText2) as EditText
        val editText3 = findViewById(R.id.editText3) as EditText
        val editView5 = findViewById(R.id.editText5) as EditText
        val langname : RadioButton = findViewById(R.id.langname)
        val checknsfaa : CheckBox = findViewById(R.id.checknsfaa)
        val checkvio : CheckBox = findViewById(R.id.checkvio)
        val checkbadlang : CheckBox = findViewById(R.id.checkbadlang)

            if(editText2.getText().toString().isBlank()) {
                editText2.setError("Field empty")

            }

            if (editText3.getText().toString().isBlank() ) {
                editText3.setError("Field empty")

            }

            if (editText5.getText().toString().isBlank()) {
                editText5.setError("Field empty")

            }

            if(editText5.getText().toString().isNotBlank() and editText2.getText().toString().isNotBlank() and editText3.getText().toString().isNotBlank() ) {
                Toast.makeText(
                    this,
                    "Title = " + editText2.text + "\n" + "Overview = " + editText3.text + "\n" + "Language = " + langname.text + "\n" + "Release Date = " + editView5.text + "\n" + checknsfaa.text + checkbadlang.text + "\n" +checkvio.text,
                    Toast.LENGTH_LONG
                ).show()
            }


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
            val checknsfaa : CheckBox = findViewById(R.id.checknsfaa)
            val checkvio : CheckBox = findViewById(R.id.checkvio)
            val checkbadlang : CheckBox = findViewById(R.id.checkbadlang)


            when (view.id) {
                R.id.checkbox_nsfaa -> {
                    if (checked) {
                        checkbox_vio.setVisibility(View.VISIBLE);
                        checkbox_language.setVisibility(View.VISIBLE);
                        checknsfaa.text = "Suitable for all ages = False"+"\n" + "Reason"+"\n"
                    } else {
                        checkbox_vio.setVisibility(View.INVISIBLE);
                        checkbox_language.setVisibility(View.INVISIBLE);
                        checknsfaa.text = "Suitable for all ages = True"
                    }
                }
                R.id.checkbox_vio -> {
                    if (checked) {
                        checkvio.text = "Violence"

                    } else {
                        checkvio.text = ""
                    }
                }
                R.id.checkbox_language -> {
                    if (checked) {
                        checkbadlang.text = "Language"
                    } else {
                        checkbadlang.text = ""

                    }
                }

            }
        }
    }


}

