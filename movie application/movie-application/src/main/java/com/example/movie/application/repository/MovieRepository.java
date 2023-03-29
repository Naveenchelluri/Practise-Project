package com.example.movie.application.repository;

import java.util.Optional;

//import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.application.model.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie,Integer> {

//	public Movie findByName(String movieName);


}
