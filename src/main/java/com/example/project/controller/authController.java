package com.example.project.controller;

import com.example.project.entity.authEntity;
import com.example.project.service.authService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class authController {

    @Autowired 
    private authService authService;

    @PostMapping("/register")
    public authEntity registerUser(@RequestBody authEntity user) {
        return authService.registerUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody authEntity loginRequest) {
        if (authService.validateUser(loginRequest.getUsername(), loginRequest.getPassword())) {
            return "Login successful!";
        } else {
            return "Invalid username or password";
        }
    }
}
