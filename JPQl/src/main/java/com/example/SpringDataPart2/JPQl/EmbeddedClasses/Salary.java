package com.example.SpringDataPart2.JPQl.EmbeddedClasses;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Salary {
    @Column(name = "basic_salary")
    private int basicSalary;
    @Column(name = "bonus_salary")
    private int bonusSalary;
    @Column(name = "tax_amount")
    private int taxAmount;
    @Column(name = "special_allowance_salary")
    private int specialAllowanceSalary;

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public int getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(int taxAmount) {
        this.taxAmount = taxAmount;
    }

    public int getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(int specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}
