package edu.illinois.cs.cs125.movieguide;


public interface MoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);

}