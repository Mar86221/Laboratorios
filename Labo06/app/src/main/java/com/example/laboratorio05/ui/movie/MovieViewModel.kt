package com.example.laboratorio05.ui.movie

import android.text.Spannable.Factory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.laboratorio05.MovieReviewerAplicattion
import com.example.laboratorio05.data.MovieModel
import com.example.laboratorio05.repositories.MovieRepository

class MovieViewModel(private val repository: MovieRepository):ViewModel() {

    fun getMovies() = repository.getMovies()

    fun addMovies(movie: MovieModel)= repository.addMovies(movie)

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val movieRepository =
                    (this[APPLICATION_KEY] as MovieReviewerAplicattion).movieRepository
                            MovieViewModel(movieRepository)
            }
        }
    }
}