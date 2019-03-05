package com.github.volfor.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.github.volfor.navigation.databinding.FragmentFourthBinding

class FourthFragment : Fragment() {

    private lateinit var binding: FragmentFourthBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_fourth, container, false)
        return binding.root
    }

}