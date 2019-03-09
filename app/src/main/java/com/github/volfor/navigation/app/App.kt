package com.github.volfor.navigation.app

import android.app.Application
import com.github.volfor.navigation.di.repositoriesModule
import com.github.volfor.navigation.di.viewModelsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        insertKoin()
    }

    private fun insertKoin() {
        startKoin {
            androidContext(this@App)
            modules(
                viewModelsModule,
                repositoriesModule
            )
        }
    }
}