package com.example.daggerhilt.domain.viewmodel

import androidx.lifecycle.ViewModel
import com.example.daggerhilt.domain.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val userRepository: UserRepository)
    : ViewModel() {



   }