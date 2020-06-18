package com.example.cs455020su1kevinyuprototypeserverjava.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
  private String id;



  @ManyToMany
  @JsonIgnore
  private List<User> users;



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }



}
