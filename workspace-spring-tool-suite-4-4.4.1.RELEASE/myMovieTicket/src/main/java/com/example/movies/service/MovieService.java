package com.example.movies.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.movies.document.Movie;

public interface MovieService {

	public String addMovie(Movie movie);
	
	public Movie  findbyId(String id);
	
	public List<Movie> getAll();
	
	public Movie findbyName(String movieName);
	
	public String removeMovie(String id);
}
