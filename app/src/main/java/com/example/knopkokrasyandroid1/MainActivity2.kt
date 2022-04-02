package com.example.knopkokrasyandroid1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val loginData: String? = intent.getStringExtra(LOGIN_DATA)
        val passwordData: String? = intent.getStringExtra(PASSWORD_DATA)

        val info:TextView = findViewById(R.id.info)
        info.text = "Ваш логин: $loginData \nВаш пароль: $passwordData"
    }

    companion object{
        const val LOGIN_DATA = "loginData"
        const val PASSWORD_DATA = "passwordData"
    }
}