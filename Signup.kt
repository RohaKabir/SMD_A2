package com.rohakabir.i200552

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btn=findViewById<Button>(R.id.signupbtn)
        btn.setOnClickListener {
            val intent= Intent(this,VerifyPhone::class.java)
            startActivity(intent)
        }


    }

    fun navigateToNextActivity(view: View) {
        val intent = Intent(this, HomeScreen1::class.java)
        startActivity(intent)

    }
}