package com.github.volfor.navigation.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.github.volfor.navigation.livedata.SingleLiveEvent
import com.github.volfor.navigation.livedata.ViewAction

abstract class BaseViewModel : ViewModel()

abstract class BaseEventViewModel<TEvent : ViewAction> : BaseViewModel() {

    private val _viewAction = SingleLiveEvent<TEvent>()

    val viewAction: LiveData<TEvent>
        get() = _viewAction

    fun sendEvent(event: TEvent) {
        _viewAction.postValue(event)
    }
}