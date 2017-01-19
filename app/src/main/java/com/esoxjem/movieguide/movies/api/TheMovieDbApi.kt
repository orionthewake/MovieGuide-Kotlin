package com.esoxjem.movieguide.movies.api

import retrofit2.http.GET
import retrofit2.http.QueryMap
import rx.Observable


/**
 * @author arunsasidharan
 */
interface TheMovieDbApi {
    @GET("/3/discover/movie")
    fun getVenues(@QueryMap map: Map<String, String>): Observable<PopularMoviesResponse>
}
