package com.example.SpringDataPart2.JPQl.Service.joinedInheritance;


import com.example.SpringDataPart2.JPQl.entities.JoinedInheritance.EmployeePermanent;
import com.example.SpringDataPart2.JPQl.entities.JoinedInheritance.EmployeeTraining;
import com.example.SpringDataPart2.JPQl.repositories.EmployeeForJoinedInheritanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeForJoinedInheritanceService {
    @Autowired
    EmployeeForJoinedInheritanceRepository repository;

    public void createEmployeeUsingJoined(){
        EmployeePermanent employeePermanent=new EmployeePermanent();
        EmployeeTraining employeeTraining=new EmployeeTraining();
        employeePermanent.setId(1);
        employeePermanent.setPermanentId(111);
        employeePermanent.setName("Mike");

        employeeTraining.setId(2);
        employeeTraining.setTrainingId(222);
        employeeTraining.setName("Echo");
        repository.save(employeePermanent);
        repository.save(employeeTraining);
    }
}
