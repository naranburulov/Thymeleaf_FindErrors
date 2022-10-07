package com.example.thymeleaf_training.service.implementation;

import com.example.thymeleaf_training.bootstrap.DataGenerator;
import com.example.thymeleaf_training.model.User;
import com.example.thymeleaf_training.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {
    @Override
    public List<User> getUsers() {
        return DataGenerator.USER_LIST;
    }

    @Override
    public void save(User user) {
        DataGenerator.USER_LIST.add(user);
    }
}
