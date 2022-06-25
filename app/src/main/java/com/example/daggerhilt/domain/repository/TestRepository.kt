package com.example.daggerhilt.domain.repository

import com.example.daggerhilt.model.UserEntity

interface TestRepository {
    fun doLogin(user: UserEntity)
}