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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="employees")
public class Employee {

    @Id // This annotation will make it a primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    public Employee(long id, String firstName, String lastName, String email) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//    }
//
//    public Employee() {
//    }

    @NotNull
    @Size(min=2 , message = "First name character must be more one")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotNull
    @Size(min=2 , message = "First name character must be more one")
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Size(min=5 , message = "Salary must be atleast 10000")
    @Column(name = "salary")
    private long salary;

    @Email
    @Column(name = "email")
    private String email;
}
