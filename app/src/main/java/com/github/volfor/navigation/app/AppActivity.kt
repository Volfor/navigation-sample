package com.github.volfor.navigation.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.github.volfor.navigation.R
import kotlinx.android.synthetic.main.activity_app.*

class AppActivity : AppCompatActivity() {

    private val navController by lazy { findNavController(R.id.navHostFragment) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        bottomNavigation.setupWithNavController(navController)
    }
}
