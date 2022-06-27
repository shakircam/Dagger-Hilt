package com.example.daggerhilt.domain.repository

import android.app.Application
import android.util.Log
import com.example.daggerhilt.R
import com.example.daggerhilt.data.remote.FakeApi
import javax.inject.Inject

/*
  If we use Repository Module we need to use @Inject constructor annotation here.
  If we use provideUserRepositoryImp from network module we don't need to use this  @Inject constructor annotation.

  This is the two way for providing dependency for abstraction.
  The Second way is better because dagger hilt implement less code.
 */

class UserRepositoryImp @Inject constructor(
    private val api: FakeApi, appContext : Application) : UserRepository {

    init {
        val name = appContext.getString(R.string.app_name)
        Log.d("tag","app name from hilt repo:$name ")
    }

    override fun doLogin() {
       // api.userLogin()
    }
}