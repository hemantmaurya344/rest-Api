package com.springBootWeb.services;

import com.springBootWeb.entities.User;
import com.springBootWeb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void addUser(User u) {
        userRepository.save(u);
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }
}
