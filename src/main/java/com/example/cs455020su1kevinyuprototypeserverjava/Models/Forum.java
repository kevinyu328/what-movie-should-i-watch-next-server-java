package com.example.cs455020su1kevinyuprototypeserverjava.Models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="forums")
public class Forum {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String title;
  private String text;

  @OneToMany(mappedBy = "forum")
  private List<Comment> comments;





  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(
      List<Comment> comments) {
    this.comments = comments;
  }
}
