package com.example.asanbekov_youtubeapi.remote


import com.example.asanbekov_youtubeapi.BuildConfig
import com.example.asanbekov_youtubeapi.core.network.BaseDataSource
import org.koin.dsl.module

val remoteDataSource = module {
    factory { RemoteDataSource(get()) }
}
class RemoteDataSource(private val apiService: ApiService) : BaseDataSource() {



    suspend fun getPlaylists() = getResult {
        apiService.getPlaylist(
            BuildConfig.API_KEY,
            "contentDetails,snippet",
            "UCkJ1rbOrsyPfBuHNfnLPm-Q",
            20
        )
    }

    suspend fun getPlaylistItem(playlistId: String?) = getResult {
        apiService.getPlaylistItem(
            BuildConfig.API_KEY,
            "contentDetails,snippet",
            playlistId!!,
            20
        )
    }
}