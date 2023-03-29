package com.example.movie.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.application.model.Movie;
import com.example.movie.application.service.MovieService;

@RestController
@RequestMapping("/movie")

public class MovieController {
	
	@Autowired 
	MovieService movieService;
	
	@PostMapping("/add")
	public Movie addMovie(@RequestBody Movie data) {
		return movieService.save(data);
	}
	

	@GetMapping("/get")
	public List<Movie> findAll(){
		return movieService.findAll();
	}
	
	
	@GetMapping("/find/id/{id}")
	 public Optional<Movie> findById(@PathVariable  int id){
		
		return movieService.findById(id);
		   
	}
	
//	@GetMapping("/find/name/{movieName}")
//	 public Movie findByName(@PathVariable (" movie") String movieName){
//		
//		return movieService.findByName(movieName);
//		   
//	} not working
//	
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id ){
		return movieService.deleteById(id);
	}
	
	
	@PutMapping("/update")
	public Movie updateMovie(@RequestBody Movie data) {
		return movieService.save(data);
	}
	
	
	
	
	
	
	
	

}
