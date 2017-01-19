package com.esoxjem.movieguide.movies.listing

import com.esoxjem.movieguide.movies.api.PopularMoviesResponse
import com.esoxjem.movieguide.movies.api.TheMovieDbApi
import retrofit2.Retrofit
import rx.Observable

/**
 * @author arunsasidharan
 */
class ListingInteractorImpl(retrofit: Retrofit) : ListingInteractor {

    private val movieDbApi: TheMovieDbApi = retrofit.create(TheMovieDbApi::class.java)

    override fun getListOfMovies(): Observable<PopularMoviesResponse> {
        return movieDbApi.getVenues(createQueryMap())
    }

    private fun createQueryMap(): Map<String, String> {
        return hashMapOf(
                "language" to "en",
                "sort_by" to "popularity.desc")
    }
}