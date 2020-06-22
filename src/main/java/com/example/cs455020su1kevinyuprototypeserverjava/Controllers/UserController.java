package com.example.cs455020su1kevinyuprototypeserverjava.Controllers;

import com.example.cs455020su1kevinyuprototypeserverjava.Models.User;
import com.example.cs455020su1kevinyuprototypeserverjava.Services.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(
    origins = "https://cs4550-20su1-kevinyu-prototype.herokuapp.com/",
    allowCredentials = "true")
public class UserController {
  @Autowired
  UserService service;


  @GetMapping("/api/users/{username}")
  public User getUserByUsername(@PathVariable("username") String username) {
    return service.findUserByUsername(username);
  }


  @PostMapping("/api/register")
  public User register(
      @RequestBody User user,
      HttpSession session) {
    User existingUser = service.findUserByUsername(user.getUsername());
    if(existingUser == null) {
      User currentUser = service.createUser(user);
      session.setAttribute("currentUser", currentUser);
      return currentUser;
    }
    return null;
  }

  @PostMapping("/api/profile")
  public User profile(HttpSession session) {
    User currentUser = (User)session.getAttribute("currentUser");
    return currentUser;
  }


  @PutMapping("/api/profile/update")
  public User update(@RequestBody User updatedUser, HttpSession session) {
    User currentUser = (User)session.getAttribute("currentUser");
    return service.updateUser(currentUser, updatedUser);
  }


  @PostMapping("/api/login")
  public User login(
      @RequestBody User user,
      HttpSession session) {
    User currentUser = service.findUserByCredentials(user.getUsername(), user.getPassword());
    session.setAttribute("currentUser", currentUser);
    return currentUser;
  }

  @PostMapping("/api/logout")
  public void logout(HttpSession session) {
    session.invalidate();
  }

}


