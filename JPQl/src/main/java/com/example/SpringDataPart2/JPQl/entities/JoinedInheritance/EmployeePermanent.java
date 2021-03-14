package com.example.SpringDataPart2.JPQl.entities.JoinedInheritance;

import javax.persistence.*;

@Entity
@Table(name = "employee_permanent")
@PrimaryKeyJoinColumn(name = "emp_id")
public class EmployeePermanent extends EmployeeForJoinedInheritance {
    @Id
    @Column(name = "emp_id")
    private int id;
    @Column(name = "permanent_id")
    private int permanentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPermanentId() {
        return permanentId;
    }

    public void setPermanentId(int permanentId) {
        this.permanentId = permanentId;
    }
}
