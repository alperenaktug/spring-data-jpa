package com.alperenaktug.contoller;

import com.alperenaktug.dto.DtoStudent;
import com.alperenaktug.dto.DtoStudentUI;
import com.alperenaktug.entities.Student;

import java.util.List;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentUI dtoStudentUI);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public Student updateStudent(Integer id, Student updateStudent);

}
