package com.example.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movies.Repo.MovieRepo;
import com.example.movies.document.Movie;
@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepo movierepo;

	@Override
	public String addMovie(Movie movie) {
		// TODO Auto-generated method stub
		try {
			movierepo.save(movie);
			return "added";
		}catch(Exception e) {
			return "error";
		}
		
	}

	@Override
	public Movie findbyId(String id) {
		// TODO Auto-generated method stub
		return movierepo.findById(id).get();
	}

	@Override
	public List<Movie> getAll() {
		// TODO Auto-generated method stub
		return (List<Movie>)movierepo.findAll();
	}

	@Override
	public Movie findbyName(String movieName) {
		// TODO Auto-generated method stub
		return movierepo.findByMovieName(movieName);
	}

	@Override
	public String removeMovie(String id) {
		// TODO Auto-generated method stub
		try {
			movierepo.deleteById(id);
			return "deleted";
		}catch(Exception e) {
			return "error";
		}
	
	}

}
