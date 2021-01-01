package cl.egabyte.movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.egabyte.movies.databinding.ViewMovieItemBinding
import cl.egabyte.movies.model.Movie
import com.bumptech.glide.Glide

class MoviesAdapter(
        var movies: List<Movie>,
        private val interfaceClick: (Movie) -> Unit): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewMovieItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val movie = movies[position]
        holder.binding(movie)
        holder.itemView.setOnClickListener {
            interfaceClick(movie)
        }
    }

    override fun getItemCount(): Int = movies.size

    class ViewHolder(private val  binding: ViewMovieItemBinding): RecyclerView.ViewHolder(binding.root){
        // Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView);
        fun binding(movie: Movie){
            binding.nameTextView.text = movie.title
            Glide.with(binding.root.context).load("https://image.tmdb.org/t/p/w185/${movie.poster_path}").into(binding.coverImageView)
        }

    }
}