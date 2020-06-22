package com.example.cs455020su1kevinyuprototypeserverjava.Repositories;

import com.example.cs455020su1kevinyuprototypeserverjava.Models.Movie;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

  @Query("SELECT movie FROM Movie movie WHERE movie.user.username=:username")
  List<Movie> findFavoriteMoviesForUser(@Param("username") String username);
}
