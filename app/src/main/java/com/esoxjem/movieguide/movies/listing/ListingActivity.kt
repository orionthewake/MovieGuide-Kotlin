package com.esoxjem.movieguide.movies.listing

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.esoxjem.movieguide.R

class ListingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listing)
        loadListingFragment(savedInstanceState)
    }

    private fun loadListingFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState != null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.listingContainer, ListingFragment.getInstance(), ListingFragment.javaClass.simpleName)
                    .commit()
        }
    }
}
