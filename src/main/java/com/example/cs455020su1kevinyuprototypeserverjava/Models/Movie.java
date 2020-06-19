package com.example.cs455020su1kevinyuprototypeserverjava.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String imdbId;


  //  @ManyToMany
  @ManyToOne
  @JsonIgnore
  private User user;



  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getImdbId() {
    return imdbId;
  }

  public void setImdbId(String imdbId) {
    this.imdbId = imdbId;
  }


//  public List<User> getUsers() {
//    return users;
//  }
//
//  public void setUsers(List<User> users) {
//    this.users = users;
//  }


  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


}
