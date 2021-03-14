package com.example.SpringDataPart2.JPQl.repositories;

import com.example.SpringDataPart2.JPQl.entities.JoinedInheritance.EmployeeForJoinedInheritance;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeForJoinedInheritanceRepository extends CrudRepository<EmployeeForJoinedInheritance,Integer> {
}
