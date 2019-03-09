package com.github.volfor.navigation.screens.photo.list

import androidx.navigation.fragment.findNavController
import com.github.volfor.navigation.R
import com.github.volfor.navigation.base.BaseBoundVmFragment
import com.github.volfor.navigation.databinding.FragmentPhotosBinding
import com.github.volfor.navigation.livedata.ViewAction
import com.github.volfor.navigation.livedata.observeEvent
import com.github.volfor.navigation.screens.photo.list.PhotosFragmentDirections as Directions

class PhotosFragment : BaseBoundVmFragment<FragmentPhotosBinding, PhotosViewModel>(
    R.layout.fragment_photos,
    PhotosViewModel::class
) {
    sealed class Event : ViewAction {
        data class Open(val photo: String) : Event()
    }

    override fun initObservers() {
        vm.viewAction.observeEvent(this) {
            when (it) {
                is Event.Open -> findNavController().navigate(Directions.actionOpenPhoto(it.photo))
            }
        }
    }
}