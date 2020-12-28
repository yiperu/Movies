package cl.egabyte.movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.egabyte.movies.databinding.ViewMovieItemBinding

class MoviesAdapter(private val movies: List<Movie>): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewMovieItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding(movies[position])
    }

    override fun getItemCount(): Int = movies.size

    class ViewHolder(private val  binding: ViewMovieItemBinding): RecyclerView.ViewHolder(binding.root){
        fun binding(movie: Movie){
            binding.nameTextView.text = movie.name
        }

    }
}