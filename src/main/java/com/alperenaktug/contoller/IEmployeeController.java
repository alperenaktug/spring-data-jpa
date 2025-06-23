package com.alperenaktug.contoller;

import com.alperenaktug.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {
    public List<DtoEmployee> findAllEmployees();
}
