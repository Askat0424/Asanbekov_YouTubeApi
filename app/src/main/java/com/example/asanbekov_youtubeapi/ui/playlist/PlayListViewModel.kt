package com.example.asanbekov_youtubeapi.ui.playlist

import androidx.lifecycle.LiveData
import com.example.asanbekov_youtubeapi.core.network.result.Resource
import com.example.asanbekov_youtubeapi.core.ui.BaseViewModel
import com.example.asanbekov_youtubeapi.model.Playlist
import com.example.asanbekov_youtubeapi.repository.Repository

class PlaylistViewModel(private val repository: Repository) : BaseViewModel() {

    fun getPlaylists(): LiveData<Resource<Playlist>> {
        return repository.getPlaylists()
    }
}