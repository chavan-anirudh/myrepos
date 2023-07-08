
package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	Optional<Movie>findByMovieName(String moviename);
	 
}
