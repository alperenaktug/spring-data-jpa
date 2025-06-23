package com.alperenaktug.contoller.impl;


import com.alperenaktug.contoller.IEmployeeController;
import com.alperenaktug.dto.DtoEmployee;
import com.alperenaktug.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping(path = "/list")
    @Override
    public List<DtoEmployee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }
}

