package com.alperenaktug.services.impl;

import com.alperenaktug.dto.DtoDepartment;
import com.alperenaktug.dto.DtoEmployee;
import com.alperenaktug.entities.Employee;
import com.alperenaktug.repository.EmployeeRepository;
import com.alperenaktug.services.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;



    @Override
    public List<DtoEmployee> findAllEmployees() {

        List<DtoEmployee> dtoEmployeeList = new ArrayList<>();

        List<Employee> employeeList = employeeRepository.findAll();
       if( employeeList!=null && !employeeList.isEmpty()){
         for(Employee employee: employeeList){
             DtoEmployee dtoEmployee = new DtoEmployee();
             BeanUtils.copyProperties(employee,dtoEmployee);

             dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId() ,
                     employee.getDepartment().getDepartmentName()));

             dtoEmployeeList.add(dtoEmployee);


         }

       }



        return dtoEmployeeList;
    }
}
