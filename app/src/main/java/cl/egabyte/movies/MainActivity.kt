package cl.egabyte.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import cl.egabyte.movies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.MovieRecyclerView.adapter = MoviesAdapter(
            listOf(
                Movie("Title 1", "https://loremflickr.com/320/240?lock=1"),
                Movie("Title 2", "https://loremflickr.com/320/240?lock=2"),
                Movie("Title 3", "https://loremflickr.com/320/240?lock=3"),
                Movie("Title 4", "https://loremflickr.com/320/240?lock=4"),
                Movie("Title 5", "https://loremflickr.com/320/240?lock=5"),
                Movie("Title 6", "https://loremflickr.com/320/240?lock=6"),
                Movie("Title 7", "https://loremflickr.com/320/240?lock=7"),
                Movie("Title 8", "https://loremflickr.com/320/240?lock=8"),
                Movie("Title 9", "https://loremflickr.com/320/240?lock=9")
            )

        )


    }
}