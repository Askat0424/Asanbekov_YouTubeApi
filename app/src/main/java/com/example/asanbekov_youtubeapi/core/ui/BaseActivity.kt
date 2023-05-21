package com.example.asanbekov_youtubeapi.core.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewbinding.ViewBinding


abstract class BaseActivity<VB : ViewBinding,VM : BaseViewModel>: AppCompatActivity() {

    protected lateinit var binding: VB
    protected abstract fun inflateViewBinding() : VB
    protected abstract val viewModel: VM


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateViewBinding()
        setContentView(binding.root)
        isConnection()
        initViews()
        initViewModel()
        initListener()
    }
    open fun isConnection() {}
    open fun initViews() {}
    open fun initListener() {}
    open fun initViewModel() {}
}