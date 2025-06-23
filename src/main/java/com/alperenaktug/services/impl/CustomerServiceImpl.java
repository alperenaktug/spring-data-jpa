package com.alperenaktug.services.impl;

import com.alperenaktug.dto.DtoAddress;
import com.alperenaktug.dto.DtoCustomer;
import com.alperenaktug.entities.Address;
import com.alperenaktug.entities.Customer;
import com.alperenaktug.repository.CustomerRepository;
import com.alperenaktug.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
   private CustomerRepository customerRepository;

    @Override
    public DtoCustomer findCustomerById(Long id) {

        DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAddress dtoAddress = new DtoAddress();

      Optional<Customer> optional = customerRepository.findById(id);
      if(optional.isEmpty()){
         return null;
      }
      Customer customer=optional.get();
        Address address= optional.get().getAddress();

        BeanUtils.copyProperties(customer , dtoCustomer);
        BeanUtils.copyProperties(address , dtoAddress);

        dtoCustomer.setAddress(dtoAddress);

        return dtoCustomer;
    }
}
