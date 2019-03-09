package com.github.volfor.navigation.screens.photo

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.github.volfor.navigation.R
import com.github.volfor.navigation.base.BaseBoundVmFragment
import com.github.volfor.navigation.databinding.FragmentPhotosBinding
import com.github.volfor.navigation.livedata.ViewAction
import com.github.volfor.navigation.livedata.observeEvent
import com.github.volfor.navigation.models.Photo
import com.github.volfor.navigation.screens.photo.PhotoFragmentDirections as Directions

class PhotoFragment : BaseBoundVmFragment<FragmentPhotosBinding, PhotoViewModel>(
    R.layout.fragment_photo,
    PhotoViewModel::class
) {
    sealed class Event : ViewAction {
        data class OpenInfo(val photo: Photo) : Event()
    }

    private val args by navArgs<PhotoFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vm.init(args.photo)
    }

    override fun initObservers() {
        vm.viewAction.observeEvent(this) {
            when (it) {
                is Event.OpenInfo -> findNavController().navigate(Directions.actionOpenPhotoInfo(it.photo))
            }
        }
    }
}
