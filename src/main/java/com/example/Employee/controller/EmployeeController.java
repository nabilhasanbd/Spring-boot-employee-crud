package com.example.Employee.controller;

import com.example.Employee.Model.Employee;
import com.example.Employee.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
//@RequiredArgsConstructor
public class EmployeeController {

    @Autowired // if we use @autowired and @RequiredArgsConstructor then we dont need to create constructor
    private EmployeeService employeeService;

//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello employee";
    }

    @PostMapping(value = "/save-employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED); // to send a response HttpStatus with entity we use ResponseEntity
    }

//    @PostMapping(value = "/save-employee")
//    public void saveEmployee(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//    }

    @GetMapping(value = "/list/employee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(value = "/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long id) {
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(id), HttpStatus.OK);
    }

    @PutMapping(value = "/edit/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/employee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<String>("Employee deleted successfully !!", HttpStatus.OK);

    }


}
