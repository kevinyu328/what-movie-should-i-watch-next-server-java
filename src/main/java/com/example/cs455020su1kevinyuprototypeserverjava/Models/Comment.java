package com.example.cs455020su1kevinyuprototypeserverjava.Models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {
  @Id
  private String username;
  @Id
  private long forumId;
  private String title;
  private String text;



  @ManyToOne
  @PrimaryKeyJoinColumn(name="forum", referencedColumnName="ID")
  private Forum forum;
}
