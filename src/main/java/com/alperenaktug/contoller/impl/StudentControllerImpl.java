package com.alperenaktug.contoller.impl;

import com.alperenaktug.contoller.IStudentController;
import com.alperenaktug.dto.DtoStudent;
import com.alperenaktug.dto.DtoStudentUI;
import com.alperenaktug.entities.Student;
import com.alperenaktug.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;

  @PostMapping(path = "/save")
  @Override
    public DtoStudent saveStudent(@RequestBody DtoStudentUI dtoStudentUI) {
      return studentService.saveStudent(dtoStudentUI);
  }

  @GetMapping(path = "/list")
    @Override
    public List<DtoStudent> getAllStudents() {
        return studentService.getAllStudents();

    }

  @GetMapping(path = "/list/{id}")
    @Override
    public DtoStudent getStudentById(@PathVariable(name = "id") Integer id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteStudent(@PathVariable(name = "id") Integer id) {
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "/update/{id}")
    @Override
    public DtoStudent updateStudent(@PathVariable(name = "id") Integer id,
                                 @RequestBody DtoStudentUI  dtoStudentUI) {
          return studentService.updateStudent(id, dtoStudentUI);
    }


}
