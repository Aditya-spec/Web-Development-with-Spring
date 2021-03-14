package com.example.SpringDataPart2.JPQl.repositories;

import com.example.SpringDataPart2.JPQl.entities.SingleTableInheritance.EmployeeSingleTableInheritance;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeSingleTableInheritanceRepository extends CrudRepository<EmployeeSingleTableInheritance,Integer> {
}
