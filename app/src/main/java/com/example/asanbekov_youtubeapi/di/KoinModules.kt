package com.example.asanbekov_youtubeapi.di

import com.example.asanbekov_youtubeapi.core.network.networkModule
import com.example.asanbekov_youtubeapi.remote.remoteDataSource
import org.koin.core.module.Module

val koinModules = listOf<Module>(
    repoModules,
    viewModules,
    remoteDataSource,
    networkModule
)