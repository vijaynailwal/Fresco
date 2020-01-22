package com.example.fresco

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()
        //Initializing
        Fresco.initialize(this)
    }
}