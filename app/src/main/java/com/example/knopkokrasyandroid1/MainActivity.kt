package com.example.knopkokrasyandroid1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonTransition : Button = findViewById(R.id.button)
        buttonTransition.setOnClickListener { transition() }


    }

    private fun transition() {
        val intent = Intent(this, MainActivity2::class.java)
        val login : EditText = findViewById(R.id.login)
        val password : EditText = findViewById(R.id.password)
        val incorrectSome: TextView = findViewById(R.id.textView)
        intent.putExtra(MainActivity2.LOGIN_DATA,login.text.toString())
        intent.putExtra(MainActivity2.PASSWORD_DATA,password.text.toString())
        if (password.length() >7 && login.length()>2) startActivity(intent)
        else incorrectSome.text = "Некорректный логин и/или пароль"
    }
}