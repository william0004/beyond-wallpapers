package com.example.html.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.html.demo.model.User;
import com.example.html.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void initializeUsers(){
        User user1 = new User("test1", "hello@gmail.com", "test");
        saveUserDetails(user1);

        User user2 = new User("test2", "hello@gmail.com", "test");
        saveUserDetails(user2);

        User user3 = new User("test3", "hello@gmail.com", "test");
        saveUserDetails(user3);

        User user4 = new User("test4", "hello@gmail.com", "test");
        saveUserDetails(user4);

        User user5 = new User("test5", "hello@gmail.com", "test");
        saveUserDetails(user5);

    }



    public User saveUserDetails(User user){

        return userRepository.save(user);
        
    } 

}