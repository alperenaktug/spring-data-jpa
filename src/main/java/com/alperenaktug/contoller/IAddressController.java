package com.alperenaktug.contoller;

import com.alperenaktug.dto.DtoAddress;

public interface IAddressController {
    public DtoAddress findAddressById(Long id);
}
