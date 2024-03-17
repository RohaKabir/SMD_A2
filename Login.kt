package com.rohakabir.i200552

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.text.SpannableString
import android.text.Spanned
import android.text.style.UnderlineSpan
import android.widget.Button



class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val textView = findViewById<TextView>(R.id.signup)
        val text = "Sign Up"

        val spannableString = SpannableString(text)
        spannableString.setSpan(
            UnderlineSpan(),
            0,
            text.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        textView.text = spannableString

        val forgotPasswordButton: Button = findViewById(R.id.forgotyourpass)

        forgotPasswordButton.setOnClickListener {
            // Handle the click event and navigate to the next activity
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }


    }
    fun gotosignup(view: View) {
        val intent = Intent(this, Signup::class.java)
        startActivity(intent)

    }
}