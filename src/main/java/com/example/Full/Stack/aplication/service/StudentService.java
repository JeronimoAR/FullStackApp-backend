package com.example.Full.Stack.aplication.service;

import com.example.Full.Stack.aplication.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public void deleteStudent(Student student);
    public void updateStudent(Student student);
}
