package com.example.SpringDataPart2.JPQl.Service.TableInheritance;

import com.example.SpringDataPart2.JPQl.entities.TablePerClassInheritance.Permanent;
import com.example.SpringDataPart2.JPQl.entities.TablePerClassInheritance.Trainee;
import com.example.SpringDataPart2.JPQl.repositories.EmployeeForTableStrategyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeForTableStrategyService {
    @Autowired
    EmployeeForTableStrategyRepository repository;

    public void createEmployeeforTableStrategy(){
        Permanent employee1=new Permanent();
        Trainee employee2 =new Trainee();

        employee1.setId(1);
        employee1.setName("Charlie");
        employee1.setSalary(13000);
        employee1.setPermanentId(111);

        employee2.setId(2);
        employee2.setName("Delta");
        employee2.setSalary(19000);
        employee2.setTrainingId(222);

        repository.save(employee1);
        repository.save(employee2);
    }
}
