package com.example.SpringDataPart2.JPQl.entities.TablePerClassInheritance;

import javax.persistence.*;

@Entity
@Table(name = "permanent_employee")
public class Permanent extends EmployeeForTableStrategy {
    @Id
    @Column(name = "emp_id")
    private int id;
    @Column(name = "emp_name")
    private String name;
    @Column(name = "emp_salary")
    private int salary;
    @Column(name = "permanent_id")
    private int permanentId;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPermanentId() {
        return permanentId;
    }

    public void setPermanentId(int permanentId) {
        this.permanentId = permanentId;
    }
}
