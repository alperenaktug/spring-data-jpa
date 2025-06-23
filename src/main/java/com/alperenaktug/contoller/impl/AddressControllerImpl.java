package com.alperenaktug.contoller.impl;


import com.alperenaktug.contoller.IAddressController;
import com.alperenaktug.dto.DtoAddress;
import com.alperenaktug.repository.AddressRepository;
import com.alperenaktug.services.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest/api/address")
public class AddressControllerImpl implements IAddressController {

    @Autowired
    private IAddressService addressService;


    @GetMapping(path = "/list/{id}")
    @Override
    public DtoAddress findAddressById(@PathVariable(name = "id") Long id) {
        return addressService.findAddressById(id);
    }
}
