package com.example.daggerhilt.domain.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggerhilt.domain.repository.TestRepository



class TestViewModelFactory(private val testRepository: TestRepository): ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(TestViewModel::class.java)) {
            return TestViewModel(testRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class name")
    }




}