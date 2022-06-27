package com.example.daggerhilt.di

import com.example.daggerhilt.domain.repository.UserRepository
import com.example.daggerhilt.domain.repository.UserRepositoryImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton



 /* Second way ...
   If we use this way we need to write inject constructor annotation in user repositoryImp class.
 */

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepository(
        userRepositoryImp: UserRepositoryImp
    ) :UserRepository

}