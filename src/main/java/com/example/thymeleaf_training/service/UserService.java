package com.example.thymeleaf_training.service;

import com.example.thymeleaf_training.model.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();

    public void save(User user);
}
