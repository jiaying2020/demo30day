package com.example.demo30day;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo30day","com.example.model","com.example.controller","com.example.service","com.example.repository"})
@EntityScan({"com.example.demo30day","com.example.model","com.example.controller","com.example.service","com.example.repository"})
public class Demo30dayApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Demo30dayApplication.class, args);
    }

}
