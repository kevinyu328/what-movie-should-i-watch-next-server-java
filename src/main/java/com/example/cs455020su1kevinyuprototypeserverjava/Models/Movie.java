package com.example.cs455020su1kevinyuprototypeserverjava.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;





  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
