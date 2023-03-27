package com.example.Employee.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=2 , message = "First name character must be more one")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotNull
    @Size(min=2 , message = "First name character must be more one")
    @Column(name = "last_name")
    private String lastName;

    @Email
    @Column(name = "email")
    private String email;
}
