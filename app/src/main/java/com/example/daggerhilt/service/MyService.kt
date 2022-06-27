package com.example.daggerhilt.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.daggerhilt.domain.repository.UserRepository
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService : Service() {

    /*
      This is android component class and it's not possible to inject parameter constructor.
      So we are inject field constructor here.
     */

    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()
        userRepository.doLogin()
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}