package com.example.Full.Stack.aplication.repository;

import com.example.Full.Stack.aplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
