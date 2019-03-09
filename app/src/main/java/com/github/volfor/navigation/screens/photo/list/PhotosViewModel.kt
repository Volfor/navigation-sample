package com.github.volfor.navigation.screens.photo.list

import androidx.lifecycle.MutableLiveData
import com.github.volfor.navigation.BR
import com.github.volfor.navigation.R
import com.github.volfor.navigation.base.BaseEventViewModel
import com.github.volfor.navigation.repositories.PhotosRepository
import com.github.volfor.navigation.screens.photo.list.PhotosFragment.Event
import me.tatarka.bindingcollectionadapter2.ItemBinding

class PhotosViewModel(
    private val photosRepository: PhotosRepository
) : BaseEventViewModel<PhotosFragment.Event>(), PhotoItem.Listener {

    val items = MutableLiveData<List<PhotoItem>>()
    val itemBinding = ItemBinding.of<PhotoItem>(BR.item, R.layout.item_photo)
        .bindExtra(BR.listener, this@PhotosViewModel)

    init {
        items.value = photosRepository.getPhotos()
            .map { PhotoItem(it) }
    }

    override fun onClick(item: PhotoItem) {
        sendEvent(Event.Open(item.photo))
    }
}