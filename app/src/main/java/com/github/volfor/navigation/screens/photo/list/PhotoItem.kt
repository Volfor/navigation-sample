package com.github.volfor.navigation.screens.photo.list

import com.github.volfor.navigation.models.Photo

data class PhotoItem(
    val photo: Photo
) {
    interface Listener {
        fun onClick(item: PhotoItem)
    }
}