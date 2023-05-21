package com.example.asanbekov_youtubeapi.core.view

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImage(image:String) {
    Glide.with(this).load(image).into(this)
}