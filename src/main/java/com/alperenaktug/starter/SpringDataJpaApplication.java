package com.alperenaktug.starter;

import com.alperenaktug.configuration.GlobalProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.alperenaktug"})
@EntityScan(basePackages = {"com.alperenaktug"})
@EnableJpaRepositories(basePackages = {"com.alperenaktug"})
@EnableConfigurationProperties(value = GlobalProperties.class)
// @PropertySource(value = "classpath:application.properties")
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

}
