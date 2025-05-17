package com.alperenaktug.services;

import com.alperenaktug.entities.Student;

import java.util.List;

public interface IStudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

    public Student getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public Student updateStudent(Integer id, Student updateStudent);
}
