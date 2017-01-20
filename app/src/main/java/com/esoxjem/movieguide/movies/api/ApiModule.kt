package com.esoxjem.movieguide.movies.api

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * @author arunsasidharan
 */
@Module
class ApiModule {
    @Provides @Singleton @Named("baseUrl")
    fun provideBaseUrl(): String {
        return "http://api.themoviedb.org/"
    }
}
