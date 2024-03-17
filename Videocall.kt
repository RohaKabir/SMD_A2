package com.rohakabir.i200552

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Videocall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videocall)
        navigateToNextActivity(findViewById<View>(android.R.id.content))
    }

    fun navigateToNextActivity(view: View) {
        val intent = Intent(this, Audiocall::class.java)
        startActivity(intent)
    }
}