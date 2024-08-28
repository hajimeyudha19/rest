package com.ensat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensat.entities.Users;
import com.ensat.repositories.UsersRepository;

@Service
public class UserService {

    @Autowired
    private UsersRepository userRepository;

    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    public Users getUserById(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
