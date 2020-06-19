package com.example.cs455020su1kevinyuprototypeserverjava.Services;

import com.example.cs455020su1kevinyuprototypeserverjava.Models.Comment;
import com.example.cs455020su1kevinyuprototypeserverjava.Models.Forum;
import com.example.cs455020su1kevinyuprototypeserverjava.Repositories.CommentRepository;
import com.example.cs455020su1kevinyuprototypeserverjava.Repositories.ForumRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

  @Autowired
  CommentRepository commentRepository;

  @Autowired
  ForumRepository forumRepository;

  public Comment createComment(Integer forumId, Comment comment) {
    Forum forum = forumRepository.getForumById(forumId);
    comment.setForum(forum);
    return commentRepository.save(comment);
  }

  public List<Comment> getAllComments() {
    return commentRepository.getAllComments();
  }

  public List<Comment> getAllCommentsForForum(Integer forumId) {
    return commentRepository.getAllCommentsForForum(forumId);
  }

  public Comment deleteComment(Integer commentId) {
    commentRepository.deleteById(commentId);
    return null;
  }

  public Comment updateComment(Integer commentId, Comment updatedComment) {
    Comment comment = commentRepository.findCommentById(commentId);
    comment.setText(updatedComment.getText());
    return commentRepository.save(comment);
  }
}
