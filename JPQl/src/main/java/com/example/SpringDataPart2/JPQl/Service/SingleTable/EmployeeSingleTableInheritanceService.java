package com.example.SpringDataPart2.JPQl.Service.SingleTable;

import com.example.SpringDataPart2.JPQl.entities.SingleTableInheritance.EmployeeSingleTableInheritance;
import com.example.SpringDataPart2.JPQl.entities.SingleTableInheritance.PermanentEmployee;
import com.example.SpringDataPart2.JPQl.entities.SingleTableInheritance.TraineeEmployee;
import com.example.SpringDataPart2.JPQl.repositories.EmployeeSingleTableInheritanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeSingleTableInheritanceService {
    @Autowired
    EmployeeSingleTableInheritanceRepository repository;

    public void createEmployee(){
        PermanentEmployee employee1=new PermanentEmployee();
        TraineeEmployee employee2=new TraineeEmployee();

        employee1.setName("Alpha");
        employee1.setSalary(23000);
        employee1.setId(1);
        employee1.setPermanentId(11);

        employee2.setId(2);
        employee2.setName("Bravo");
        employee2.setSalary(10000);
        employee2.setTrainingId(22);

        repository.save(employee1);
        repository.save(employee2);
    }
}
