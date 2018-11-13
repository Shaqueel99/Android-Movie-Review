package com.example.mshaq.androidmoviereview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radio_eng ->
                    if (checked) {

                    }
                R.id.radio_chi ->
                    if (checked) {

                    }
                R.id.radio_malay ->
                    if (checked) {

                    }
                R.id.radio_tamil ->
                    if (checked) {

                    }
            }
        }
    }
    fun onCheckboxClicked(view: View) {
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
