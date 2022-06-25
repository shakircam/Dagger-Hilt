package com.example.daggerhilt.di

import android.app.Application
import com.example.daggerhilt.data.remote.FakeApi
import com.example.daggerhilt.domain.repository.UserRepository
import com.example.daggerhilt.domain.repository.UserRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/*
  created at 21/6/2022
  Shakir
  This is Network module. We are defining this network module will provide the retrofit,okhttp client, factory converter etc...
*/


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideOkhttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(15, TimeUnit.SECONDS)
            .connectTimeout(15,TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    fun provideGsonConverterFactory():GsonConverterFactory{
        return GsonConverterFactory.create()
    }

    @Provides
    @Singleton
    fun provideRetrofitInstance(okHttpClient: OkHttpClient,gsonConverterFactory:GsonConverterFactory) : FakeApi {
        return Retrofit.Builder()
            .baseUrl("http://m.facebook.com")
            .client(okHttpClient)
            .addConverterFactory(gsonConverterFactory)
            .build()
            .create(FakeApi::class.java)
    }


    @Provides
    @Singleton
    fun provideUserRepositoryImp(fakeApi: FakeApi,app:Application): UserRepository {
        return UserRepositoryImp(fakeApi,app)
    }



}