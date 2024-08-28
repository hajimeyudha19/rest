package com.ensat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensat.entities.Users;
import com.ensat.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String saveUser(@RequestBody Users user) {
        userService.saveUser(user);
        return "User has been successfully saved with ID: " + user.getId();
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
}
