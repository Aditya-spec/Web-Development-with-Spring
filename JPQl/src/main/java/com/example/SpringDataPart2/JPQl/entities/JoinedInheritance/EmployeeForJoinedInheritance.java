package com.example.SpringDataPart2.JPQl.entities.JoinedInheritance;

import javax.persistence.*;

@Entity
@Table(name = "joining_employee")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class EmployeeForJoinedInheritance {
    @Id
    @Column(name = "emp_id")
    private int id;
    @Column(name = "emp_name")
    private String name;

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
}
