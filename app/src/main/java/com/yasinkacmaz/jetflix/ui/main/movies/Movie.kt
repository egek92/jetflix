package com.yasinkacmaz.jetflix.ui.main.movies

data class Movie(
    val id: Int,
    val name: String,
    val releaseDate: String,
    val posterPath: String,
    val voteAverage: Double,
    val voteCount: Int
)
