package com.alperenaktug.contoller;

import com.alperenaktug.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(Long id);
}
