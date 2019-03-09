package com.github.volfor.navigation.screens.photo

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.github.volfor.navigation.R
import com.github.volfor.navigation.base.BaseBoundVmFragment
import com.github.volfor.navigation.databinding.FragmentPhotosBinding

class PhotoFragment : BaseBoundVmFragment<FragmentPhotosBinding, PhotoViewModel>(
    R.layout.fragment_photo,
    PhotoViewModel::class
) {
    private val args by navArgs<PhotoFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vm.init(args.photo)
    }
}
