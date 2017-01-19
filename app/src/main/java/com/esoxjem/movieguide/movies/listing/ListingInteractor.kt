package com.esoxjem.movieguide.movies.listing

import com.esoxjem.movieguide.movies.api.PopularMoviesResponse
import rx.Observable

/**
 * @author arunsasidharan
 */
interface ListingInteractor {
    fun getListOfMovies() : Observable<PopularMoviesResponse>
}