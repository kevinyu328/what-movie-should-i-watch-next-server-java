package com.example.cs455020su1kevinyuprototypeserverjava.Services;

import com.example.cs455020su1kevinyuprototypeserverjava.Models.Movie;
import com.example.cs455020su1kevinyuprototypeserverjava.Models.User;
import com.example.cs455020su1kevinyuprototypeserverjava.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  UserRepository repository;



  public User createUser(User user) {
    return repository.save(user);
  }
  public User findUserById(Integer id) {
    return repository.findUserById(id);
  }

  public User findUserByCredentials(String username, String password) {
    return repository.findUserByCredentials(username, password);
  }

  public User findUserByUsername(String username) {
    return repository.findUserByUsername(username);
  }

  public User updateUser(User currentUser, User updatedUser) {
    currentUser.setUsername(updatedUser.getUsername());
    currentUser.setPassword(updatedUser.getPassword());
    currentUser.setRole(updatedUser.getRole());
    currentUser.setEmail(updatedUser.getEmail());
    currentUser.setPhone(updatedUser.getPhone());
    return repository.save(currentUser);
  }

}