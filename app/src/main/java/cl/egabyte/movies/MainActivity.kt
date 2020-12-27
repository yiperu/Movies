package cl.egabyte.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.egabyte.movies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.messageTextView.text = "Hello Android"


    }
}