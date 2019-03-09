package com.github.volfor.navigation.screens.photo.list

data class PhotoItem(
    val photo: String
) {
    interface Listener {
        fun onClick(item: PhotoItem)
    }
}