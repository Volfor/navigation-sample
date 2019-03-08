package com.github.volfor.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.github.volfor.navigation.databinding.FragmentThirdBinding
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment() {

    private val navController by lazy { Navigation.findNavController(activity!!, R.id.navHostFragment) }

    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_third, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnOpenFourth.setOnClickListener {
            navController.navigate(MainFragmentDirections.actionOpenFourth())
        }
    }

}