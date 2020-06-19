package com.example.cs455020su1kevinyuprototypeserverjava.Services;

import com.example.cs455020su1kevinyuprototypeserverjava.Models.Comment;
import com.example.cs455020su1kevinyuprototypeserverjava.Models.Forum;
import com.example.cs455020su1kevinyuprototypeserverjava.Repositories.ForumRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForumService {

  @Autowired
  ForumRepository forumRepository;

  public Forum createForum(Forum forum) {
    return forumRepository.save(forum);
  }


  public List<Forum> findAllForums() {
    return forumRepository.findAllForums();
  }

  public void deleteForum(Integer forumId) {
    forumRepository.deleteForumById(forumId);
  }

  public Forum getForumById(Integer forumId) {
    return forumRepository.getForumById(forumId);
  }

  public Forum updateForum(Integer forumId, Comment updatedForum) {
    Forum forum = forumRepository.getForumById(forumId);
    forum.setTitle(updatedForum.getTitle());
    forum.setText(updatedForum.getText());
    return forumRepository.save(forum);
  }

//  public Forum updateForumText(Integer forumId, Comment updatedForum) {
//    Forum forum = forumRepository.getForumById(forumId);
////    forum.setTitle(updatedForum.getTitle());
//    forum.setText(updatedForum.getText());
//    return forumRepository.save(forum);
//  }


}
