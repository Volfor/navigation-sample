package com.github.volfor.navigation

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.github.volfor.navigation.utils.SpaceItemDecoration

@BindingAdapter("url")
fun setImageDrawable(view: ImageView, imageUrl: String) {
    Glide.with(view)
        .load(imageUrl)
        .into(view)
}

@BindingAdapter("dividerSize")
fun setRecyclerViewDivider(recycler: RecyclerView, size: Float) {
    recycler.addItemDecoration(SpaceItemDecoration(size.toInt()))
}