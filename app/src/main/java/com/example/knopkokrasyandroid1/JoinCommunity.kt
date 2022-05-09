package com.example.knopkokrasyandroid1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.knopkokrasyandroid1.databinding.FragmentJoinCommunityBinding

class JoinCommunity : Fragment() {
    private lateinit var binding: FragmentJoinCommunityBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_join_community, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentJoinCommunityBinding.bind(view)
        binding.haveAcc.setOnClickListener {
            (activity as? MainActivity)?.startFragment(welcomeBackFragment)
        }
    }
}