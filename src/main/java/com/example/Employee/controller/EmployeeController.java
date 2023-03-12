package com.example.Employee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/hello")
    public String hello()
    {
        return "Hello employee";
    }
}
