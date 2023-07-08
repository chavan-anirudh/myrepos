package com.app.service;

import java.util.List;

import com.app.entities.Movie;

public interface MovieServices {

	List<Movie> getAllMovies();

	Movie addNewMovie(Movie transientMovie);

	Movie updateMovieDetails(Movie detachedMovie);

	Movie getMovieByName(String moviename);

}
