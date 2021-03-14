package com.example.SpringDataPart2.JPQl.entities.SingleTableInheritance;

import javax.persistence.*;

@Entity
@Table(name = "employee_for_single_table_inheritance")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "employment_type",discriminatorType = DiscriminatorType.STRING)
public abstract class EmployeeSingleTableInheritance {

    @Id
    @Column(name = "emp_id")
    private int id;
    @Column(name = "emp_name")
    private String name;
    @Column(name = "emp_salary")
    private int Salary;

    public int getId() {
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

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
