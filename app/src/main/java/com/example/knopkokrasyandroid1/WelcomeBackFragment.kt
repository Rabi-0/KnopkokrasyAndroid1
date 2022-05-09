package com.example.knopkokrasyandroid1

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.knopkokrasyandroid1.databinding.FragmentWelcomeBackBinding


class WelcomeBackFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBackBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome_back, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentWelcomeBackBinding.bind(view)
        binding.buttonSignin.setOnClickListener { transitionOnShowEmail() }
        binding.signUp.setOnClickListener { (activity as? MainActivity)?.startFragment(joinCommunity) }
        binding.forgotPassword.setOnClickListener {
            (activity as? MainActivity)?.startFragment(forgotPassword)
        }
    }

    private fun transitionOnShowEmail() {
        if (Patterns.EMAIL_ADDRESS.matcher(binding.inputEmail.text)
                .matches() && binding.inputPassword.length() > 7 && binding.inputPassword.text.any { it.isDigit() }) {
            (activity as? MainActivity)?.startFragment(showEmailFragment)
            (activity as? MainActivity)?.passData(binding.inputEmail.text.toString())
        } else if (!Patterns.EMAIL_ADDRESS.matcher(binding.inputEmail.text)
                .matches() && (binding.inputPassword.length() < 8 || !binding.inputPassword.text.any { it.isDigit() })) {
            binding.inputEmail.error = requireContext().getString(R.string.incorrect_email)
            binding.inputPassword.error = requireContext().getString(R.string.incorrect_password)
        } else if (binding.inputPassword.length() < 8 || !binding.inputPassword.text.any { it.isDigit() })
            binding.inputPassword.error = requireContext().getString(R.string.incorrect_password)
        else binding.inputEmail.error = requireContext().getString(R.string.incorrect_email)
    }
}
