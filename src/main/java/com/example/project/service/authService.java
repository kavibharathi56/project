package com.example.project.service;

import com.example.project.entity.authEntity;
import com.example.project.repository.authRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class authService {

    @Autowired
    private authRepository authRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public authEntity registerUser(authEntity user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return authRepository.save(user);
    }

    public authEntity findByUsername(String username) {
        return authRepository.findByUsername(username);
    }

    public boolean validateUser(String username, String password) {
        authEntity user = authRepository.findByUsername(username);
        return user != null && passwordEncoder.matches(password, user.getPassword());
    }
}
