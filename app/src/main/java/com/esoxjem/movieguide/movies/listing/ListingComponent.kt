package com.esoxjem.movieguide.movies.listing

import dagger.Subcomponent

/**
 * @author arunsasidharan
 */
@ListingScope
@Subcomponent(modules = arrayOf(ListingModule::class))
interface ListingComponent {
    fun inject(target: ListingFragment)
}