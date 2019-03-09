package com.github.volfor.navigation.screens.photo

import androidx.lifecycle.MutableLiveData
import com.github.volfor.navigation.base.BaseEventViewModel
import com.github.volfor.navigation.models.Photo
import com.github.volfor.navigation.screens.photo.PhotoFragment.Event

class PhotoViewModel : BaseEventViewModel<PhotoFragment.Event>() {

    val photo = MutableLiveData<Photo>()

    fun init(photo: Photo) {
        this.photo.value = photo
    }

    fun openInfo(photo: Photo) {
        sendEvent(Event.OpenInfo(photo))
    }

}