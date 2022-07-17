package com.example.android.dagger

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner

class MyCustomTestRunner : AndroidJUnitRunner() {

    override fun newApplication(cl: ClassLoader?, name: String?, context: Context?): Application {
        return super.newApplication(cl, MyTestApplication::class.java.name, context)
    }
}
