package com.esoxjem.movieguide.movies.listing

/**
 * @author arunsasidharan
 */
class ListingPresenterImpl(listingInteractor: ListingInteractor) : ListingPresenter {
    lateinit private var view: ListingView

    override fun setView(listingView: ListingView) {
        view = listingView
    }
}