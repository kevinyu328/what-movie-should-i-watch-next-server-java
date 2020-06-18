package com.example.cs455020su1kevinyuprototypeserverjava.Controllers;


import com.example.cs455020su1kevinyuprototypeserverjava.Models.Movie;
import com.example.cs455020su1kevinyuprototypeserverjava.Services.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MovieController {

  @Autowired
  MovieService movieService;


  @GetMapping("/api/users/{username}/favorites")
  public List<Movie> findFavoriteMoviesForUser(@PathVariable("username") String username) {
    return movieService.findFavoriteMoviesForUser(username);
  }


  @PostMapping("/api/users/{username}/favorites")
  public Movie addMovieToFavorites(@PathVariable("username") String username, @RequestBody Movie movie) {
    return movieService.addMovieToFavorites(username, movie);
  }






}
