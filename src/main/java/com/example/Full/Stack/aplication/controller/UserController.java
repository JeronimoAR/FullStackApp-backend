package com.example.Full.Stack.aplication.controller;


import com.example.Full.Stack.aplication.model.User;

import com.example.Full.Stack.aplication.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserServiceImp UserService;

    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return UserService.getAllUsers();
    }

    @PostMapping("/add")
    public String add(@RequestBody User user){
        UserService.saveUser(user);
        return "New user is Added";
    }

    @PostMapping("/update")
    public String update(@RequestBody User user){
        UserService.updateUser(user);
        return "User has been updated";
    }
    @DeleteMapping("/delete")
    public String delete(@RequestBody User user){
        UserService.deleteUser(user);
        return "user has been deleted";
    }
}
