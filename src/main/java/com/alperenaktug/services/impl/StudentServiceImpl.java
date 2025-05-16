package com.alperenaktug.services.impl;

import com.alperenaktug.entities.Student;
import com.alperenaktug.repository.StudentRepository;
import com.alperenaktug.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
       return studentRepository.save(student);

    }
}
