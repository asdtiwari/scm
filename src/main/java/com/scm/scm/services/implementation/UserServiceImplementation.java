package com.scm.scm.services.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.scm.entities.User;
import com.scm.scm.repository.UserRepository;
import com.scm.scm.services.UserServices;

@Service
public class UserServiceImplementation implements UserServices{

    @Autowired
    private UserRepository userRepo;
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
