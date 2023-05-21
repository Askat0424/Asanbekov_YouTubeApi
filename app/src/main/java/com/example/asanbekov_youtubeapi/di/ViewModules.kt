package com.example.asanbekov_youtubeapi.di


import com.example.asanbekov_youtubeapi.ui.playlist.PlaylistViewModel
import com.example.asanbekov_youtubeapi.ui.playlistitem.PlaylistItemViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModules = module {
    viewModel { PlaylistItemViewModel(get()) }
    viewModel { PlaylistViewModel(get()) }
}