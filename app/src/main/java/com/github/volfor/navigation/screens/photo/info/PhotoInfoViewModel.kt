package com.github.volfor.navigation.screens.photo.info

import androidx.lifecycle.MutableLiveData
import com.github.volfor.navigation.base.BaseViewModel
import com.github.volfor.navigation.models.Photo

class PhotoInfoViewModel : BaseViewModel() {

    val photo = MutableLiveData<Photo>()

    fun init(photo: Photo) {
        this.photo.value = photo
    }

}