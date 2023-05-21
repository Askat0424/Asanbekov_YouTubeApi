package com.example.asanbekov_youtubeapi.remote


import com.example.asanbekov_youtubeapi.model.Playlist
import com.example.asanbekov_youtubeapi.model.PlaylistItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("playlists")
    suspend fun getPlaylist(
        @Query("key") apiKey: String,
        @Query("part") part: String,
        @Query("channelId") channelId: String,
        @Query("maxResults") maxResult: Int,
    ) : Response<Playlist>

    @GET("playlistItems")
    suspend fun getPlaylistItem(
        @Query("key") apiKey: String,
        @Query("part") part: String,
        @Query("playlistId") playlistId: String,
        @Query("maxResults") maxResult: Int,
    ): Response<PlaylistItem>
}