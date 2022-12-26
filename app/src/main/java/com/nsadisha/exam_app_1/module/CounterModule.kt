package com.nsadisha.exam_app_1.module

import com.nsadisha.exam_app_1.model.Counter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CounterModule {

    @Provides
    @Singleton
    fun provideCounter(): Counter{
        return Counter()
    }
}