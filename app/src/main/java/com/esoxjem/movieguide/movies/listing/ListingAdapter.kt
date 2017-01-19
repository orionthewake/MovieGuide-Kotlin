package com.esoxjem.movieguide.movies.listing

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.esoxjem.movieguide.R
import com.esoxjem.movieguide.movies.models.Movie

/**
 * @author arunsasidharan
 */
class ListingAdapter(val movies: List<Movie>) : RecyclerView.Adapter<ListingAdapter.ViewHolder>() {
    class ViewHolder(root: View?) : RecyclerView.ViewHolder(root) {
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val root = (LayoutInflater.from(parent?.context).inflate(R.layout.movie_grid_item, parent, false))
        return ViewHolder(root)
    }

}