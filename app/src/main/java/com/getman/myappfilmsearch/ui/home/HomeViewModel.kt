package com.getman.myappfilmsearch.ui.home

import android.content.res.loader.ResourcesProvider
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel(resourceProvider: ResourcesProvider) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Home Fragment"
    }
    val text: LiveData<String> = _text
}