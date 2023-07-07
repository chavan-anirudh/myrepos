package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Movie;
import com.app.service.MovieServices;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
 private MovieServices movieservices;
	
	@GetMapping
	public List<Movie> listmovies(){
		return movieservices.getAllMovies();
	}
	
	@PostMapping
	public ResponseEntity<?> saveMovieDetails(@RequestBody Movie transientMovie){
		
		return new ResponseEntity<>(movieservices.addNewMovie(transientMovie),HttpStatus.CREATED);
		
	}
	
	@PutMapping
	public Movie updateMovieDetails(@RequestBody Movie detachedMovie) {
		return movieservices.updateMovieDetails(detachedMovie);
	}
	
	@GetMapping("/{movie_name}")
    public ResponseEntity<List<Movie>> getCoursesByName(@RequestParam String courseName) {
        List<Movie> courses = movieservices.getAllCoursesByCourseName(courseName);
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
	}

