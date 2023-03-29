package com.example.movie.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie.application.model.Movie;
import com.example.movie.application.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;

	public Movie save(Movie data) {
		// TODO Auto-generated method stub
		return movieRepository.save(data);
	}

	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

//	public Optional<Movie> findById(int id) {
//		// TODO Auto-generated method stub
//		return movieRepository.findById(id);
//	}
	
	

//	public String deleteById(int id) {
//		// TODO Auto-generated method stub
//		 movieRepository.deleteById(id);
//		 
//		 return "movie removed || " +id;
//	}

	public String deleteById(int id) {
		if (!findById(id).isEmpty()) {
		  movieRepository.deleteById(id);
		     return "Id " + id + " deleted!";
		}
		else {
			return   "id "   + id +  " not found";
		}
		        
	}

	public Optional<Movie> findById(int id) {
		// TODO Auto-generated method stub
		return movieRepository.findById(id);
	}

	

//	public Movie findByName(String movieName) {
//		// TODO Auto-generated method stub
//		return movieRepository.findByName(movieName);
//	}    not working
    
	



	

 

	
	

	
	

}
