package com.vastika.userinfomanagement.service;

import com.vastika.userinfomanagement.model.User;
import com.vastika.userinfomanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }
}
