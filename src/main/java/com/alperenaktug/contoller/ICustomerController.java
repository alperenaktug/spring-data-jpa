package com.alperenaktug.contoller;

import com.alperenaktug.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);

}
