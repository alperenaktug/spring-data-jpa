package com.alperenaktug.services;

import com.alperenaktug.dto.DtoEmployee;
import com.alperenaktug.entities.Employee;

import java.util.List;

public interface IEmployeeService {

    public List<DtoEmployee> findAllEmployees();
}
