package com.example.asanbekov_youtubeapi.di

import com.example.asanbekov_youtubeapi.repository.Repository
import org.koin.dsl.module

val repoModules = module {
    single { Repository(get()) }
}