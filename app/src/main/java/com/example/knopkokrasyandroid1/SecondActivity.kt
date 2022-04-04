package com.example.knopkokrasyandroid1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val loginData: String? = intent.getStringExtra(LOGIN_DATA)

        val info:TextView = findViewById(R.id.info)
        info.text = "Ваш логин: $loginData"
    }

    companion object{
        const val LOGIN_DATA = "loginData"
    }
}