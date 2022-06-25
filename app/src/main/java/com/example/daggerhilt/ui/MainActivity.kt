package com.example.daggerhilt.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.daggerhilt.R
import com.example.daggerhilt.domain.repository.TestRepositoryImp
import com.example.daggerhilt.domain.viewmodel.TestViewModel
import com.example.daggerhilt.domain.viewmodel.TestViewModelFactory
import com.example.daggerhilt.domain.viewmodel.UserViewModel
import dagger.hilt.android.AndroidEntryPoint

/*
  Here we are seeing the difference if we use dependency injection like hilt
  Our code are clean & no boilerplate code uses. Refactoring & unit test will be easy.

  If we not using the dependency, we need to write same boilerplate code to others activity.
 */

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //hilt view model
        val hiltViewModel = ViewModelProvider(this)[UserViewModel::class.java]


        /*
          normal view model
          Here we need to initialise view model.
          This view model depended to repository.
          And repository depended to view model factory
         */
        val testRepository = TestRepositoryImp(applicationContext)
        val testFactory = TestViewModelFactory(testRepository)
        val testViewModel = ViewModelProvider(this, testFactory)[TestViewModel::class.java]

    }


}