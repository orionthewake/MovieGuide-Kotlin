package com.esoxjem.movieguide.movies.listing

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * @author arunsasidharan
 */
@Module
class ListingModule {

    @Provides
    fun provideListingPresenter(listingInteractor: ListingInteractor): ListingPresenter {
        return ListingPresenterImpl(listingInteractor, null)
    }

    @Provides @ListingScope
    fun provideListingInteractor(retrofit: Retrofit): ListingInteractor {
        return ListingInteractorImpl(retrofit)
    }
}