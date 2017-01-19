package com.esoxjem.movieguide.movies.listing

import com.esoxjem.movieguide.movies.models.Movie

/**
 * @author arunsasidharan
 */
interface ListingView {
    fun showMovies(movies: List<Movie>?)
}