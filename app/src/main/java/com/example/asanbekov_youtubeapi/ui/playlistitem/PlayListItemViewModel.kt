package com.example.asanbekov_youtubeapi.ui.playlistitem

import androidx.lifecycle.LiveData
import com.example.asanbekov_youtubeapi.core.network.result.Resource
import com.example.asanbekov_youtubeapi.core.ui.BaseViewModel
import com.example.asanbekov_youtubeapi.model.PlaylistItem
import com.example.asanbekov_youtubeapi.repository.Repository

class PlaylistItemViewModel(private val repository: Repository): BaseViewModel() {
    fun getPlaylistItem(playlistId: String?): LiveData<Resource<PlaylistItem>> {
        return repository.getPlaylistItem(playlistId!!)
    }
}