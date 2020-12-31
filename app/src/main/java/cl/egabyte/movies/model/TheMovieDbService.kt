package cl.egabyte.movies.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheMovieDbService {

    @GET("movie/popular")
    fun listPopularMovies(@Query("api_key") apiKey: String): Call<MovieDbResult>
}