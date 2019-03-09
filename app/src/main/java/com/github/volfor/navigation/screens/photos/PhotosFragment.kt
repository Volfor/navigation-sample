package com.github.volfor.navigation.screens.photos

import com.github.volfor.navigation.R
import com.github.volfor.navigation.base.BaseBoundVmFragment
import com.github.volfor.navigation.databinding.FragmentPhotosBinding

class PhotosFragment : BaseBoundVmFragment<FragmentPhotosBinding, PhotosViewModel>(
    R.layout.fragment_photos,
    PhotosViewModel::class
)