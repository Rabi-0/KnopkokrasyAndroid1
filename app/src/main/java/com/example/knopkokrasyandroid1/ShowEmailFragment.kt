package com.example.knopkokrasyandroid1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.knopkokrasyandroid1.databinding.FragmentShowEmailBinding

open class ShowEmailFragment : Fragment() {

    private lateinit var binding: FragmentShowEmailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_show_email, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentShowEmailBinding.bind(view)
        binding.email.text = arguments?.getString("email")
    }
}
