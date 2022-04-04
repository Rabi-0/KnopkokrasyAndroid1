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
        val buttonTransition: Button = findViewById(R.id.button)
        buttonTransition.setOnClickListener { transition() }


    }

    private fun transition() {
        val login: EditText = findViewById(R.id.login)
        val password: EditText = findViewById(R.id.password)
        val incorrectSome: TextView = findViewById(R.id.textView)
        when {
            (password.length() > 7 && login.length() > 2 && password.text.any { it.isDigit() }) -> {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra(SecondActivity.LOGIN_DATA, login.text.toString())
                startActivity(intent)
            }
            (login.length() < 3 && (password.length() < 8 || !password.text.any { it.isDigit() })) -> incorrectSome.text =
                "Некоректные логин и пароль"
            (password.length() < 8 || !password.text.any { it.isDigit() }) -> incorrectSome.text =
                "Некорректный пароль"
            else -> incorrectSome.text = "Некорректный логин"
        }
    }
}
