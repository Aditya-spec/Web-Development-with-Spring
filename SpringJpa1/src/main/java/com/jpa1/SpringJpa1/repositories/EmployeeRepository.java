package com.jpa1.SpringJpa1.repositories;


import com.jpa1.SpringJpa1.entities.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    List<Employee> findByName(String name);

    List<Employee> findByAgeBetween(int startingAge, int endingAge);

    List<Employee> findByNameLike(String firstWord);


}
