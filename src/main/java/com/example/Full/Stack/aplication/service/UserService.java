package com.example.Full.Stack.aplication.service;

import com.example.Full.Stack.aplication.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
    public void deleteUser(User user);
    public void updateUser(User user);
}
