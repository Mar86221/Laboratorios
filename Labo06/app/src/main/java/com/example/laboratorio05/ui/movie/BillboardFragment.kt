package com.example.laboratorio05.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05.R
import com.google.android.material.floatingactionbutton.FloatingActionButton




class billboardFragment : Fragment() {

    private lateinit var buttonNewMovie: FloatingActionButton
    private lateinit var recyclerViewModel: RecyclerView
    //private lateinit var recyclerMovies: RecyclerView

    private val viewModel: MovieViewModel by viewModels {
        MovieViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_billboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()

        recyclerViewModel.adapter = MoviesAdapter().apply {
            submitData(viewModel.getMovies())
            Log.d("NewMovieFragment", viewModel.getMovies().toString())
        }/*
        recyclerMovies.adapter = MoviesAdapter().apply {
            submitData(viewModel.getMovies())
        }*/
        buttonNewMovie.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_newMovieFragment)
        }


    }




    private fun bind(){
        buttonNewMovie = view?.findViewById(R.id.new_movie_button) as FloatingActionButton
        recyclerViewModel = view?.findViewById(R.id.recycler_movies) as RecyclerView
        //recyclerMovies = view?.findViewById(R.id.recycler_movies) as RecyclerView

    }



}

