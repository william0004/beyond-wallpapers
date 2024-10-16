package com.example.html.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.html.demo.model.User;

@Controller
public class ProfileController {
    @GetMapping("/profile")
    public String home(){
        return "profile";
    }
}
