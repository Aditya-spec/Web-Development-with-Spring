package com.example.SpringDataPart2.JPQl.entities.TablePerClassInheritance;

import javax.persistence.*;

@Entity
@Table(name = "trainee_employee")
public class Trainee extends EmployeeForTableStrategy{
    @Id
    @Column(name = "emp_id")
    private int id;
    @Column(name = "emp_name")
    private String name;
    @Column(name = "emp_salary")
    private int salary;
    @Column(name = "training_id")
    private int trainingId;

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

    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }
}
