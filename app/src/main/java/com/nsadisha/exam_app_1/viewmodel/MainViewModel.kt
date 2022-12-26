package com.nsadisha.exam_app_1.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nsadisha.exam_app_1.model.Counter
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val injectedCounter: Counter
): ViewModel() {
    private var _count = MutableLiveData<Counter>()
    val count = _count

    fun increment(){
        _count.value?.incrementCount()
        _count.postValue(_count.value)
//        _count.postValue(_count.value?.plus(1))
    }

    fun decrement(){
        _count.value?.decrementCount()
        _count.postValue(_count.value)
//        _count.postValue(_count.value?.minus(1))
    }

    init {
        _count.value = injectedCounter
    }
}