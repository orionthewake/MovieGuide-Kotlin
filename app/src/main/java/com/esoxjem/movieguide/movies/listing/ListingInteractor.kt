package com.esoxjem.movieguide.movies.listing

import com.esoxjem.movieguide.movies.models.Movie
import rx.Observable

/**
 * @author arunsasidharan
 */
interface ListingInteractor {
    fun getListOfMovies() : Observable<List<Movie>>
}