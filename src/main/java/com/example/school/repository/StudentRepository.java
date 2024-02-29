package com.example.school.repository;

import org.springframework.stereotype.Repository;

import com.example.school.model.Student;

import java.util.ArrayList;

@Repository
public interface StudentRepository {
    ArrayList<Student> getStudents();

    Student getStudentById(int studentId);

    Student addStudent(Student student);

    String addMultipleStudents(ArrayList<Student> studentsList);

    Student updateStudent(int studentId, Student student);

    void deleteStudent(int studentId);

}