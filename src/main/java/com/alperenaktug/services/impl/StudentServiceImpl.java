package com.alperenaktug.services.impl;

import com.alperenaktug.dto.DtoCourse;
import com.alperenaktug.dto.DtoStudent;
import com.alperenaktug.dto.DtoStudentUI;
import com.alperenaktug.entities.Course;
import com.alperenaktug.entities.Student;
import com.alperenaktug.repository.StudentRepository;
import com.alperenaktug.services.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentUI dtoStudentUI) {
        DtoStudent response= new DtoStudent();
        Student student = new Student();
        BeanUtils.copyProperties(dtoStudentUI, student);

        Student dbStudent = studentRepository.save(student);
        BeanUtils.copyProperties(dtoStudentUI, response);
       return response ;
    }

    @Override
    public List<DtoStudent> getAllStudents() {

        List<DtoStudent> dtoList = new ArrayList<>();
        List<Student>studentList = studentRepository.findAllStudent();

        for (Student student : studentList) {
            DtoStudent dto = new DtoStudent();
            BeanUtils.copyProperties(student, dto);
            dtoList.add(dto);
        }


        return dtoList;
    }

    @Override
    public DtoStudent getStudentById(Integer id) {
     DtoStudent dtoStudent = new DtoStudent();
     Optional<Student> optional = studentRepository.findById(id);
     if(optional.isEmpty()){
         return null;
     }
     Student dbStudent = optional.get();
     BeanUtils.copyProperties(dbStudent, dtoStudent);

     if (dbStudent.getCourses() != null && !dbStudent.getCourses().isEmpty()) {
         for (Course course : dbStudent.getCourses()) {
             DtoCourse dtoCourse = new DtoCourse();
             BeanUtils.copyProperties(course, dtoCourse);

             dtoStudent.getCourses().add(dtoCourse);
         }
     }
     return dtoStudent;
    }

    @Override
    public void deleteStudent(Integer id) {

        Optional<Student> optional =  studentRepository.findById(id);
        if(optional!= null) {
            studentRepository.delete(optional.get());
        }

    }

    @Override
    public DtoStudent updateStudent(Integer id, DtoStudentUI dtoStudentUI) {
         DtoStudent dto = new DtoStudent();

         Optional<Student> optional =  studentRepository.findById(id);
         if (optional.isPresent()) {
             Student dbStudent = optional.get();
             dbStudent.setFirstName(dtoStudentUI.getFirstName());
             dbStudent.setLastName(dtoStudentUI.getLastName());
             dbStudent.setBirthOfDate(dtoStudentUI.getBirthOfDate());

             Student student = studentRepository.save(dbStudent);
             BeanUtils.copyProperties(dtoStudentUI, dbStudent);
             return dto;
         }
         return null;
    }

}
