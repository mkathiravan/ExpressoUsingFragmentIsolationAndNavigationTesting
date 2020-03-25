package net.kathir.fragmentisolation.data.source

import net.kathir.fragmentisolation.data.Movie

interface MoviesDataSource {

    fun getMovie(movieId : Int): Movie?
}