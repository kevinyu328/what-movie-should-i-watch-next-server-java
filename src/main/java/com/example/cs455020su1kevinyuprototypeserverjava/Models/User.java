package com.example.cs455020su1kevinyuprototypeserverjava.Models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String username;
  private String password;
  private String email;
  private String phone;


//  @ManyToMany
//  @JoinTable(
//      name="favorites",
//      joinColumns=@JoinColumn(name="USER_ID", referencedColumnName="ID"),
//      inverseJoinColumns=@JoinColumn(name="MOVIE_ID", referencedColumnName="ID"))
  @OneToMany(mappedBy = "user")
  private List<Movie> favoriteMovies;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public List<Movie> getFavoriteMovies() {
    return favoriteMovies;
  }

  public void setFavoriteMovies(
      List<Movie> favoriteMovies) {
    this.favoriteMovies = favoriteMovies;
  }
}
