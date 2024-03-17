package com.rohakabir.i200552


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast
import android.R.layout
class AddMentor : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_mentor)

        val availability = listOf("Available", "Not Available")
        val autoCompleteTextView: AutoCompleteTextView = findViewById(R.id.addmentor_dropdown)
        val adapterItems = ArrayAdapter(this, R.layout.dropdown, availability)

        autoCompleteTextView.setAdapter(adapterItems)


        autoCompleteTextView.onItemClickListener = AdapterView.OnItemClickListener{
                adapterview, view, i, l ->

            val item = adapterview.getItemAtPosition(i)
            Toast.makeText(this, "Status: $item" , Toast.LENGTH_SHORT).show()


        }

        val btn = findViewById<Button>(R.id.button_upload)

        btn.setOnClickListener {
            val intent = Intent(this, Photo::class.java)
            startActivity(intent)
        }

    }


}