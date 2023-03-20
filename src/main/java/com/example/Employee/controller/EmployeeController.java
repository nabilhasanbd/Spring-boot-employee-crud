package com.example.Employee.controller;

import com.example.Employee.Model.Employee;
import com.example.Employee.Service.EmployeeService;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/hello")
    public String hello()
    {
        return "Hello employee";
    }

//    @PostMapping(value = "/save-employee")
//    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
//        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
//    }

    @PostMapping(value = "/save-employee")
    public void saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }

    @GetMapping(value = "/list/employee")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }



}
