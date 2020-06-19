package com.example.cs455020su1kevinyuprototypeserverjava.Repositories;

import com.example.cs455020su1kevinyuprototypeserverjava.Models.Comment;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CommentRepository extends CrudRepository<Comment, Integer> {

  @Query("SELECT comment FROM Comment comment")
  List<Comment> getAllComments();

  @Query("SELECT comment FROM Comment comment WHERE comment.forum.id=:forumId")
  List<Comment> getAllCommentsForForum(@Param("forumId") Integer forumId);

  @Query("SELECT comment FROM Comment comment WHERE comment.id=:commentId")
  Comment findCommentById(@Param("commentId") Integer commentId);
}
