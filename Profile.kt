package com.rohakabir.i200552

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val btn=findViewById<Button>(R.id.reviewbtn)
        btn.setOnClickListener {
            val intent= Intent(this,Review::class.java)
            startActivity(intent)
        }

        val btn2=findViewById<Button>(R.id.bookingbtn)
        btn2.setOnClickListener {
            val intent= Intent(this,BookSession::class.java)
            startActivity(intent)
        }
    }

}