package com.esoxjem.movieguide.movies.listing

import com.esoxjem.movieguide.movies.models.Movie
import rx.Observable

/**
 * @author arunsasidharan
 */
class ListingInteractorImpl : ListingInteractor {
    override fun getListOfMovies(): Observable<List<Movie>> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}