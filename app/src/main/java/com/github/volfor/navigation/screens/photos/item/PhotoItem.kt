package com.github.volfor.navigation.screens.photos.item

data class PhotoItem(
    val photo: String
) {
    interface Listener {
        fun onClick(item: PhotoItem)
    }
}