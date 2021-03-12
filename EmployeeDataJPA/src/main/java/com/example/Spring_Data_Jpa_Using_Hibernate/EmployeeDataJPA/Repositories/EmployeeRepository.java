package com.example.Spring_Data_Jpa_Using_Hibernate.EmployeeDataJPA.Repositories;

import com.example.Spring_Data_Jpa_Using_Hibernate.EmployeeDataJPA.Entities.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    List<Employee> findByName(String name);

    List<Employee> findByAgeBetween(int startingAge, int endingAge);

    List<Employee> findByNameLike(String firstWord);
}
