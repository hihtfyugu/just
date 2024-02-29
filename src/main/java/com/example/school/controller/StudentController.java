package com.example.school.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.school.service.StudentH2Service;
import com.example.school.model.Student;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class StudentController {

    @Autowired
    public StudentH2Service studentH2Service;

    @GetMapping("/students")
    public ArrayList<Student> getStudents() {
        return studentH2Service.getStudents();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable("studentId") int studentId) {
        return studentH2Service.getStudentById(studentId);
    }

    @PostMapping("/students/bulk")

    public String addMultipleStudents(@RequestBody ArrayList<Student> studentsList) {

        return studentH2Service.addMultipleStudents(studentsList);
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentH2Service.addStudent(student);
    }

    @PutMapping("/students/{studentId}")
    public Student updateStudent(@PathVariable("studentId") int studentId, @RequestBody Student student) {
        return studentH2Service.updateStudent(studentId, student);
    }

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable int studentId) {
        studentH2Service.deleteStudent(studentId);
    }

}
