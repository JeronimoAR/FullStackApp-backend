package com.example.Full.Stack.aplication.controller;

import com.example.Full.Stack.aplication.model.Student;
import com.example.Full.Stack.aplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is Added";
    }

    @PostMapping("/update")
    public String update(@RequestBody Student student){
        studentService.updateStudent(student);
        return "User has been updated";
    }
    @DeleteMapping("/delete")
    public String delete(@RequestBody Student student){
        studentService.deleteStudent(student);
        return "Student has been deleted";
    }
}
