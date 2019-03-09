package com.github.volfor.navigation.screens.photo.info

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.github.volfor.navigation.R
import com.github.volfor.navigation.base.BaseBoundVmFragment
import com.github.volfor.navigation.databinding.FragmentPhotoInfoBinding


class PhotoInfoFragment : BaseBoundVmFragment<FragmentPhotoInfoBinding, PhotoInfoViewModel>(
    R.layout.fragment_photo_info,
    PhotoInfoViewModel::class
) {
    private val args by navArgs<PhotoInfoFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vm.init(args.photo)
    }
}
