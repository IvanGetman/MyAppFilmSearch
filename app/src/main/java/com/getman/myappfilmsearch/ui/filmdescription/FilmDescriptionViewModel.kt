package com.getman.myappfilmsearch.ui.filmdescription

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmDescriptionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Film Description Fragment"
    }

    private val _text2 = MutableLiveData<String>().apply {
        value = "Description Film"
    }

    val text: LiveData<String> = _text
    val text2: LiveData<String> = _text2
}