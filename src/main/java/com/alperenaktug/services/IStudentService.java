package com.alperenaktug.services;

import com.alperenaktug.dto.DtoStudent;
import com.alperenaktug.dto.DtoStudentUI;
import com.alperenaktug.entities.Student;

import java.util.List;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentUI student);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentUI dtoStudentUI);
}
