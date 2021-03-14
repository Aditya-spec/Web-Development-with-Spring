package com.example.SpringDataPart2.JPQl.entities.JoinedInheritance;

import javax.persistence.*;

@Entity
@Table(name = "employee_training")
@PrimaryKeyJoinColumn(name = "emp_id")
public class EmployeeTraining extends EmployeeForJoinedInheritance {
    @Id
    @Column(name = "emp_id")
    private int id;
    @Column(name = "training_id")
    private int trainingId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }
}
