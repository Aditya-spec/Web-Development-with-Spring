package com.example.SpringDataPart2.JPQl.Service.ComponentMapping;

import com.example.SpringDataPart2.JPQl.EmbeddedClasses.Salary;
import com.example.SpringDataPart2.JPQl.entities.ComponentMapping.EmployeeSalaried;
import com.example.SpringDataPart2.JPQl.repositories.EmployeeSalariedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeSalariedService {

    @Autowired
    private EmployeeSalariedRepository employeeSalariedRepository;

    public void createEmployeeSalaried() {
        EmployeeSalaried employeeSalaried = new EmployeeSalaried();
        Salary salary = new Salary();

        employeeSalaried.setId(1);
        employeeSalaried.setFirstName("Akash");
        employeeSalaried.setLastName("Gupta");
        employeeSalaried.setAge(28);

        salary.setBasicSalary(32000);
        salary.setBonusSalary(12000);
        salary.setTaxAmount(3000);
        salary.setSpecialAllowanceSalary(11000);

        employeeSalaried.setSalary(salary);
        employeeSalariedRepository.save(employeeSalaried);
    }
}
