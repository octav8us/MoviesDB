package com.example.moviesdb.ui.nowplaying

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NowPlayingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text

/*
    val imgUri = dataset?.get(position)?.icon?.toUri()?.buildUpon()?.scheme("https://image.tmdb.org/t/p/w500")?.build()




    holder.itemImage.load(imgUri) {
        placeholder(R.drawable.loading_animation)
        error(R.drawable.ic_broken_image)hg
    }*/
}