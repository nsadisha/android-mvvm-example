package com.nsadisha.exam_app_1.ui.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.lifecycle.viewModelScope
import com.nsadisha.exam_app_1.R
import com.nsadisha.exam_app_1.databinding.FragmentMainBinding
import com.nsadisha.exam_app_1.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {
    private lateinit var vm: MainViewModel
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //initialize binding
        binding = FragmentMainBinding.inflate(inflater, container, false)
        //creating the viewmodel
        vm = ViewModelProvider(this)[MainViewModel::class.java]
        //set binding viewmodel to the created model
        binding.viewModel = vm
        //important
        binding.lifecycleOwner = this

//        vm.count.observe(viewLifecycleOwner){
//            Log.i("db", "$it")
//        }

        //show
        vm.count.observe(viewLifecycleOwner){
            binding.textView.text = it.count.toString()
        }

        //increment
//        binding.button.setOnClickListener {
//            vm.increment()
//        }

        //decrement
//        binding.button2.setOnClickListener {
//            vm.decrement()
//        }

        // Inflate the layout for this fragment
        return binding.root
    }
}


//benefits of di

/*
*
* Reusability
* Testability
* Easy of refactoring
* Avoid tight coupling
*
*
*
* */