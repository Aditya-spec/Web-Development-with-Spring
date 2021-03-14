package com.example.SpringDataPart2.JPQl.repositories;

import com.example.SpringDataPart2.JPQl.entities.JpqlAndNativeQuery.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Query(" from Employee e where e.salary > (select avg(salary) from Employee) ")
    List<Object> findFirstNameLastNameSalaryGreaterThanAverage(Sort sort);

    @Modifying
    @Query("update Employee e set e.salary=:salary where e.salary < (select avg(salary) from Employee)")
    void updateSalary(@Param("salary") int updatedSalary);

    @Modifying
    @Query("delete Employee e where e.salary<:salary")
    int deleteEmployeeWithMinimumSalary(@Param("salary") int minimumSalary);

    @Query(value = "select emp_id, emp_first_name, emp_age from employee_table where emp_last_name='Singh';", nativeQuery = true)
    List<Object[]> showUsersWithLastNameSingh();

    @Modifying
    @Query(value = "delete from employee_table  where emp_age>:employee_age", nativeQuery = true)
    public int deleteEmployeeWithAgeGreaterThan45(@Param("employee_age") int age);

    @Query("select avg(salary) from Employee")
    int findAverageSalary();

    @Modifying
    @Query("update Employee  set salary=:updatedSalary where salary<:avgSalary")
    void updateEmployeeHavingLessThanAveragesalary(@Param("updatedSalary") int updatedSalary,
                                                   @Param("avgSalary") int averageSalary);
}
