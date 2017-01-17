package com.esoxjem.movieguide.entity

import android.os.Parcel
import android.os.Parcelable

/**
 * @author arunsasidharan
 */
data class Movie(
        private val id: String,
        private val overview: String,
        private val posterPath: String,
        private val backdropPath: String,
        private val title: String,
        private val voteAverage: Double) : Parcelable {


    companion object {
        @Suppress("unused")
        @JvmField
        val CREATOR: Parcelable.Creator<Movie> = object : Parcelable.Creator<Movie> {
            override fun createFromParcel(source: Parcel): Movie = Movie(source)
            override fun newArray(size: Int): Array<Movie?> = arrayOfNulls(size)
        }
    }

    constructor(source: Parcel) : this(
            source.readString(),
            source.readString(),
            source.readString(),
            source.readString(),
            source.readString(),
            source.readDouble())

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(id)
        dest?.writeString(overview)
        dest?.writeString(posterPath)
        dest?.writeString(backdropPath)
        dest?.writeString(title)
        dest?.writeDouble(voteAverage)
    }
}
