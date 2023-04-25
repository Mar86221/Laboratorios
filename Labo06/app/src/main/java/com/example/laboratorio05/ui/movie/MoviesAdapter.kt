package com.example.laboratorio05.ui.movie

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.laboratorio05.R
import com.example.laboratorio05.data.MovieModel

class MoviesAdapter:RecyclerView.Adapter<MoviesAdapter.ViewHolderMovie>(){


    private var movies: List<MovieModel>? = null
    
    class ViewHolderMovie(itemView: View):RecyclerView.ViewHolder(itemView) {
        
        fun bind(movie: MovieModel){
            val imageView = itemView.findViewById<ImageView>(R.id.imageView2)
            itemView.findViewById<TextView>(R.id.movie_name).text = movie.name
            itemView.findViewById<TextView>(R.id.movie_qualification).text = movie.qualification
            Glide.with(itemView.context)
                .load(movie.image)
                .into(itemView.findViewById<ImageView>(R.id.imageView2))
            //itemView.findViewById<TextView>(R.id.textView3).text = movie.name
            //itemView.findViewById<TextView>(R.id.textView5).text = movie.qualification
            //itemView.findViewById<TextView>(R.id.textView4).text = movie.category
            //itemView.findViewById<TextView>(R.id.textView6).text = movie.description


        }
        
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMovie {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_movie, parent, false)
        
        
        return ViewHolderMovie(view)
            
    }

    override fun getItemCount(): Int = movies?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolderMovie, position: Int) {
       movies?.let {
           holder.bind(it[position])
       } 
    }
    
    fun submitData(movies : List<MovieModel>) {
        this.movies = movies
        notifyDataSetChanged()
    }


}
