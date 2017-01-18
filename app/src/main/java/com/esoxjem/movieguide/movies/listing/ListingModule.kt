package com.esoxjem.movieguide.movies.listing

import dagger.Module
import dagger.Provides

/**
 * @author arunsasidharan
 */
@Module
class ListingModule {

    @Provides
    fun provideListingPresenter(listingInteractor: ListingInteractor) : ListingPresenter {
        return ListingPresenterImpl(listingInteractor)
    }

    @Provides
    @ListingScope
    fun provideListingInteractor() : ListingInteractor {
        return ListingInteractorImpl()
    }
}