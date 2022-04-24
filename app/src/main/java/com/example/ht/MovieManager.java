package com.example.ht;

public class MovieManager {
    private Movie[] movies;
    private  MovieManager movieManager;


    private MovieManager() {

    }

    private MovieManager getInstance() {
        return movieManager;
    }

    public Movie[] listMovies() {
        return movies;
    }

    public Movie searchMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                return  movie;
            }
        }
        return null;
    }
}
