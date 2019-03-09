package com.github.volfor.navigation.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Photo(
    val author: String,
    val location: String,
    val url: String
) : Parcelable