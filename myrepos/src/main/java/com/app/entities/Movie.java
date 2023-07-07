package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="movies")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "movie_moviename",nullable = false)
	private String moviemoviename;
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(name="realeseDate")
	private LocalDate releaseDate;
	private double budget;
	private String director;
	private LocalDate updateRealeseDate;
	
	public Movie(String moviename, Category category, LocalDate releaseDate, double budget, String director,
			LocalDate updateRealeseDate) {
		super();
		this.moviemoviename = moviename;
		this.category = category;
		this.releaseDate = releaseDate;
		this.budget = budget;
		this.director = director;
		this.updateRealeseDate = updateRealeseDate;
	}
	
	

}
