package com.example.cs455020su1kevinyuprototypeserverjava.Controllers;

import com.example.cs455020su1kevinyuprototypeserverjava.Models.Comment;
import com.example.cs455020su1kevinyuprototypeserverjava.Models.Forum;
import com.example.cs455020su1kevinyuprototypeserverjava.Services.CommentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://cs4550-20su1-proto-server.herokuapp.com/")
public class CommentController {

  @Autowired
  CommentService commentService;

  @GetMapping("/api/comments")
  public List<Comment> getAllComments() {
    return commentService.getAllComments();
  }

  @GetMapping("/api/forums/{forumId}/comments")
  public List<Comment> getAllCommentsForForum(@PathVariable("forumId") Integer forumId) {
    return commentService.getAllCommentsForForum(forumId);
  }

  @PostMapping("/api/forums/{forumId}/comments")
  public Comment createComment(@PathVariable("forumId") Integer forumId, @RequestBody Comment comment) {
    return commentService.createComment(forumId, comment);
  }

  @DeleteMapping("/api/comments/{commentId}")
  public Comment deleteComment(@PathVariable("commentId") Integer commentId) {
    return commentService.deleteComment(commentId);
  }

  @PutMapping("/api/comments/{commentId}")
  public Comment updateComment(@PathVariable("commentId") Integer commentId, @RequestBody Comment updatedComment) {
    return commentService.updateComment(commentId, updatedComment);
  }


}
