package com.example.knopkokrasyandroid1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment


val welcomeBackFragment = WelcomeBackFragment()
val joinCommunity = JoinCommunity()
val forgotPassword = FragmentForgotPassword()
val showEmailFragment = ShowEmailFragment()

class MainActivity : AppCompatActivity() {

    fun passData(email: String) {
        val bundle = Bundle()
        bundle.putString("email", email)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, showEmailFragment)
            .addToBackStack(null)
            .commit()
        showEmailFragment.arguments = bundle
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, WelcomeBackFragment())
                .addToBackStack(null)
                .commit()
        }
    }

    fun startFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, fragment)
            .addToBackStack(null)
            .commit()
    }
}
