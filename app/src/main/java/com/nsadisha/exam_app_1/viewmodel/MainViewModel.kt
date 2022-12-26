package com.nsadisha.exam_app_1.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nsadisha.exam_app_1.model.Counter

class MainViewModel: ViewModel() {
    private var _count = MutableLiveData<Int>().apply {
        value = 0
    }
    val count = _count

    fun increment(){
//        _count.value?.incrementCount()
//        _count.postValue(_count.value)
        _count.postValue(_count.value?.plus(1))
    }

    fun decrement(){
//        _count.value?.decrementCount()
//        _count.postValue(_count.value)
        _count.postValue(_count.value?.minus(1))
    }
}