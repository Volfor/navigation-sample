package com.github.volfor.navigation.di

import com.github.volfor.navigation.repositories.PhotosRepository
import com.github.volfor.navigation.screens.photo.PhotoViewModel
import com.github.volfor.navigation.screens.photo.info.PhotoInfoViewModel
import com.github.volfor.navigation.screens.photo.list.PhotosViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { PhotosViewModel(get()) }
    viewModel { PhotoViewModel() }
    viewModel { PhotoInfoViewModel() }
}

val repositoriesModule = module {
    single { PhotosRepository() }
}