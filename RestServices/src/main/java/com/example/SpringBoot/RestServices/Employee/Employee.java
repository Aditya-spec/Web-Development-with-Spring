package com.example.SpringBoot.RestServices.Employee;


import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@ApiModel(description = "All details about the employee")
//@JsonFilter("EmployeeFilter")
public class Employee {

    // @JsonIgnore
    private Integer id;


    @Size(min = 2, max = 30)
    private String name;

    @Min(value = 18, message = "Age should be greater than 18")
    private int age;

    protected Employee() {
    }

    public Employee(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
