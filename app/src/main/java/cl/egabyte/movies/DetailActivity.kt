package cl.egabyte.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.egabyte.movies.databinding.ActivityDetailBinding
import cl.egabyte.movies.model.Movie
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "DetailActivity:movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val movie = intent.getParcelableExtra<Movie>(EXTRA_MOVIE)
        if (movie != null){
            binding.titleTextView.text = movie.title
            Glide.with(this)
                    .load("https://image.tmdb.org/t/p/w780/${movie.backdrop_path}")
                    .into(binding.backDropImageView)
        }

    }
}