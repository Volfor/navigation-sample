package com.github.volfor.navigation.di

import com.github.volfor.navigation.screens.photos.PhotosViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { PhotosViewModel() }
}