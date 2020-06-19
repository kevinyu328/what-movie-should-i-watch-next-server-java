//package com.example.cs455020su1kevinyuprototypeserverjava.Services;
//
//import com.example.cs455020su1kevinyuprototypeserverjava.Models.Movie;
//import com.example.cs455020su1kevinyuprototypeserverjava.Models.User;
//import com.example.cs455020su1kevinyuprototypeserverjava.Repositories.MovieRepository;
//import com.example.cs455020su1kevinyuprototypeserverjava.Repositories.UserRepository;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MovieService {
//
//  @Autowired
//  UserRepository userRepository;
//
//  @Autowired
//  MovieRepository movieRepository;
//
//
//  public Movie addMovieToFavorites(String username, Movie movie) {
//    User user = userRepository.findUserByUsername(username);
//    movie.setUser(user);
////    return movie;
//    return movieRepository.save(movie);
//  }
//
//
//
//
//  public List<Movie> findFavoriteMoviesForUser(String username) {
//    return movieRepository.findFavoriteMoviesForUser(username);
//  }
//}
