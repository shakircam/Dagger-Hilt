package com.example.daggerhilt.domain.repository

import android.app.Application
import android.util.Log
import com.example.daggerhilt.R
import com.example.daggerhilt.data.remote.FakeApi

class UserRepositoryImp(
    private val api: FakeApi, appContext : Application) : UserRepository {

    init {
        val name = appContext.getString(R.string.app_name)
        Log.d("tag","app name from hilt repo:$name ")
    }

    override fun doLogin() {
       // api.userLogin()
    }
}