package com.example.daggerhilt.domain.repository


import android.content.Context
import android.util.Log
import com.example.daggerhilt.R
import com.example.daggerhilt.model.UserEntity
import javax.inject.Inject

/*
Without setup dagger hilt
*/

class TestRepositoryImp (appContext : Context) : TestRepository {

    init {
        val name = appContext.getString(R.string.app_name)
        Log.d("tag","app name from test repo:$name ")
    }


    override fun doLogin(user: UserEntity) {
       // TODO("Not yet implemented")
    }
}
