package com.example.Full.Stack.aplication.repository;

import com.example.Full.Stack.aplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
