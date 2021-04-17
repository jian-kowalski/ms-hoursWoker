package com.jiankowalski.hruser.domain.service;

import com.jiankowalski.hruser.domain.exception.UserNotFound;
import com.jiankowalski.hruser.domain.model.User;
import com.jiankowalski.hruser.domain.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email)
            .orElseThrow(() -> new UserNotFound(email));
            
    }

    public User findUserById(Long id) {
        return userRepository.findById(id)
            .orElseThrow(() -> new UserNotFound(id));
    }
}
