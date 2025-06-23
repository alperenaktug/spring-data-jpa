package com.alperenaktug.services;

import com.alperenaktug.dto.DtoHome;

public interface IHomeService {

    public DtoHome findHomeById(Long id);
}
