package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.customexception.ResourceNotFoundException;
import com.app.dto.ApiResponse;
import com.app.entities.Movie;
import com.app.repository.MovieRepository;

@Service
@Transactional
public class MovieServiceImpl implements MovieServices {
	
	@Autowired
	private MovieRepository movieRepo;
	

	@Override
	public Movie addNewMovie(Movie transientMovie) {
		// TODO Auto-generated method stub
		return movieRepo.save(transientMovie);
	}

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return movieRepo.findAll();
	}

	@Override
	public Movie updateMovieDetails(Movie detachedMovie) {
		// TODO Auto-generated method stub
		return movieRepo.save(detachedMovie);
	}

	@Override
	public Movie getMovieByName(String moviename) {
		return (Movie) movieRepo.findByMovieName(moviename).orElseThrow(() -> new ResourceNotFoundException("Movie Not found"));
	}

}
