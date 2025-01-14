package com.scm.scm.services;

import org.springframework.stereotype.Service;

import com.scm.scm.entities.User;

@Service
public interface UserServices {
    public User saveUser(User user);
    // add more method 
}
