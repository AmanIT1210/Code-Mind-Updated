package com.example.service;

import com.example.model.User;

public interface UserService {
    User saveUser(User user);
    User findByUsername(String username);
}
