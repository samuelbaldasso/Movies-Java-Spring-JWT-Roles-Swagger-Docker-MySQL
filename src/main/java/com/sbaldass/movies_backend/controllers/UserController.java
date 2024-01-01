package com.sbaldass.movies_backend.controllers;

import com.sbaldass.movies_backend.dtos.UserDTO;
import com.sbaldass.movies_backend.services.UserService;
import com.sbaldass.movies_backend.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  public UserService userService;

  @GetMapping
  public List<UserDTO> getAll() throws Exception {
    return userService.findAllUsers();
  }

  @GetMapping("/{id}")
  public User getById(@PathVariable Long id) throws Exception {
    return userService.findUserById(id);
  }

  @PostMapping
  public User create(@RequestBody UserDTO userDTO) throws Exception {
      return userService.saveUser(userDTO);
  }

  @PutMapping("/{id}")
  public User putUser(@PathVariable Long id, @RequestBody UserDTO userDTO) throws Exception {
    return userService.alterUser(userDTO, id);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) throws Exception {
    userService.deleteUser(id);
  }

}
