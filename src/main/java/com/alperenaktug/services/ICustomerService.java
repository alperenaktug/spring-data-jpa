package com.alperenaktug.services;


import com.alperenaktug.dto.DtoCustomer;
import com.alperenaktug.entities.Customer;
import org.springframework.stereotype.Service;


public interface ICustomerService {

    public DtoCustomer findCustomerById(Long id);
}
