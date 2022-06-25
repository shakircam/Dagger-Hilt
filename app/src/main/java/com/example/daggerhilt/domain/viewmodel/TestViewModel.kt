package com.example.daggerhilt.domain.viewmodel

import androidx.lifecycle.ViewModel
import com.example.daggerhilt.domain.repository.TestRepository


class TestViewModel(private val testRepository: TestRepository)  : ViewModel() {

    /*
      if we need to access repository then we should to create view model factory class.
      view model factory will handle the view model constructor parameter like TestRepository..
     */
}