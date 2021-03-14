package com.example.SpringDataPart2.JPQl.entities.SingleTableInheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("permanent")
public class PermanentEmployee extends EmployeeSingleTableInheritance {
    @Column(name = "permanent_id")
    private int permanentId;

    public int getPermanentId() {
        return permanentId;
    }

    public void setPermanentId(int permanentId) {
        this.permanentId = permanentId;
    }
}
