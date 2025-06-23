package com.alperenaktug.services;

import com.alperenaktug.dto.DtoAddress;

public interface IAddressService {

    public DtoAddress findAddressById(Long id);
}
