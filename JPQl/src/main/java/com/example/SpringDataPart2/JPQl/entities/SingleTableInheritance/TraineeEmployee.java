package com.example.SpringDataPart2.JPQl.entities.SingleTableInheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("trainee")
public class TraineeEmployee extends EmployeeSingleTableInheritance {
    @Column(name = "training_id")
    private int trainingId;

    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }
}
