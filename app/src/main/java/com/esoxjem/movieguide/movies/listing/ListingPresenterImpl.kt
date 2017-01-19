package com.esoxjem.movieguide.movies.listing

/**
 * @author arunsasidharan
 */
class ListingPresenterImpl(val interactor: ListingInteractor) : ListingPresenter {

    lateinit private var view: ListingView

    override fun setView(listingView: ListingView) {
        view = listingView
        getListOfMovies()
    }

    private fun getListOfMovies() {
        interactor.getListOfMovies()
    }
}