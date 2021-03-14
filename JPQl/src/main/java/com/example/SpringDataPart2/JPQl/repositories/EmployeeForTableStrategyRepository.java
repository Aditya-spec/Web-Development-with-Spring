package com.example.SpringDataPart2.JPQl.repositories;

import com.example.SpringDataPart2.JPQl.entities.TablePerClassInheritance.EmployeeForTableStrategy;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeForTableStrategyRepository extends CrudRepository<EmployeeForTableStrategy,Integer> {
}
