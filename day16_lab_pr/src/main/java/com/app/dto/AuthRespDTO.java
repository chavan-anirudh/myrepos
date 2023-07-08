package com.app.dto;

import java.time.LocalDate;

import com.app.entities.Category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRespDTO {	
	private int id;
	private String moviemoviename;
	private Category category;
	private LocalDate releaseDate;
	private double budget;
	private String director;
	private LocalDate updateRealeseDate;
}
