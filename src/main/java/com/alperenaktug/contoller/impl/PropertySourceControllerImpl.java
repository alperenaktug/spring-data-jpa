package com.alperenaktug.contoller.impl;


import com.alperenaktug.configuration.DataSource;
import com.alperenaktug.configuration.GlobalProperties;
import com.alperenaktug.configuration.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/rest/api/property")
public class PropertySourceControllerImpl {

    @Autowired
    private GlobalProperties globalProperties;

    @GetMapping(path = "/datasource")
    public DataSource getDataSource(){
        DataSource dataSource = new DataSource();
     //   dataSource.setUrl(globalProperties.getUrl());
     //   dataSource.setUsername(globalProperties.getUserName());
     //   dataSource.setPassword(globalProperties.getPassword());
     //   return dataSource;
           return null;
    }
    @GetMapping(path = "/getServers")
    public List<Server> getServers(){
        return globalProperties.getServers();
    }
}
