package com.github.volfor.navigation.screens.photos

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.volfor.navigation.BR
import com.github.volfor.navigation.R
import com.github.volfor.navigation.screens.photos.item.PhotoItem
import me.tatarka.bindingcollectionadapter2.ItemBinding


class PhotosViewModel : ViewModel(), PhotoItem.Listener {

    private val photoList = listOf(
        "https://www.projectexcape.it/wp-content/uploads/2017/01/pexels-photo-248159-1.jpg",
        "https://images.unsplash.com/photo-1444090542259-0af8fa96557e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
        "https://images.unsplash.com/photo-1477346611705-65d1883cee1e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80",
        "https://images.unsplash.com/photo-1437422061949-f6efbde0a471?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
        "https://images.unsplash.com/photo-1465447142348-e9952c393450?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=968&q=80",
        "https://images.unsplash.com/photo-1437652633673-cc02b9c67a1b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
        "https://images.unsplash.com/photo-1493087670264-2f7f5844b402?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1349&q=80"
    )

    val items = MutableLiveData<List<PhotoItem>>()
    val itemBinding = ItemBinding.of<PhotoItem>(BR.item, R.layout.item_photo)
        .bindExtra(BR.listener, this@PhotosViewModel)

    init {
        items.value = getPhotos()
    }

    override fun onClick(item: PhotoItem) {
        // TODO()
    }

    private fun getPhotos(): List<PhotoItem> {
        return photoList.map { PhotoItem(it) }
    }
}