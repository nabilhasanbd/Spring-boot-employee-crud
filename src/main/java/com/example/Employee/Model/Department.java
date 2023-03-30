package com.example.Employee.Model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 3, message = "Department name must be at least 3 digit")
    private String departmentName;

    @NotNull
    private String getDepartmentID;

    private String getDepartmentType;
}
