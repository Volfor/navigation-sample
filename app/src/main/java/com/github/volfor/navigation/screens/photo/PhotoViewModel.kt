package com.github.volfor.navigation.screens.photo

import androidx.lifecycle.MutableLiveData
import com.github.volfor.navigation.base.BaseViewModel

class PhotoViewModel : BaseViewModel() {

    val photo = MutableLiveData<String>()

    fun init(photo: String) {
        this.photo.value = photo
    }

}