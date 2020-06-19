package com.example.cs455020su1kevinyuprototypeserverjava.Controllers;

import com.example.cs455020su1kevinyuprototypeserverjava.Models.Comment;
import com.example.cs455020su1kevinyuprototypeserverjava.Models.Forum;
import com.example.cs455020su1kevinyuprototypeserverjava.Services.ForumService;
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
@CrossOrigin(origins = "*")
public class ForumController {

  @Autowired
  ForumService forumService;



  @GetMapping("/api/forums")
  public List<Forum> findAllForums() {
    return forumService.findAllForums();
  }

  @GetMapping("/api/forums/{forumId}")
  public Forum getForumById(@PathVariable("forumId") Integer forumId) {
    return forumService.getForumById(forumId);
  }


  @PostMapping("/api/forums")
  public Forum createForum(@RequestBody Forum forum) {
    return forumService.createForum(forum);
  }


  @DeleteMapping("/api/forums/{forumId}")
  public void deleteForum(@PathVariable("forumId") Integer forumId) {
    forumService.deleteForum(forumId);
  }


  @PutMapping("/api/forums/{forumId}")
  public Forum updateForum(@PathVariable("forumId") Integer forumId, @RequestBody Comment updatedForum) {
    return forumService.updateForum(forumId, updatedForum);
  }

//  @PutMapping("/api/forums/{forumId}")
//  public Forum updateForumText(@PathVariable("forumId") Integer forumId, @RequestBody Comment updatedForum) {
//    return forumService.updateForumText(forumId, updatedForum);
//  }






}
