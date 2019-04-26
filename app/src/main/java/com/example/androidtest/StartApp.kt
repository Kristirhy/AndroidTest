package com.example.androidtest

import android.app.Application
import com.example.androidtest.data.PenerbitRepo

class StartApp : Application() {
    fun getBookRepo() = PenerbitRepo(this)
}
