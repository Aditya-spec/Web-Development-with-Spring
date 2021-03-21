package com.example.SpringDataPart2.JPQl.Service.JpqlAndnativeQueries;

import com.example.SpringDataPart2.JPQl.entities.JpqlAndNativeQuery.EmployeeDto;
import com.example.SpringDataPart2.JPQl.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;



    public List<Object> findFirstAndLastName() {
        List<EmployeeDto> employeeDtos=new ArrayList<>();
        List<Object> list = employeeRepository.findFirstNameLastNameSalaryGreaterThanAverage(Sort.by
                (new Sort.Order(Sort.Direction.ASC, "age"),
                        new Sort.Order(Sort.Direction.DESC, "salary")));
        return list;
    }


    @Transactional
    public void setNewSalary(int updatedSalary) {
        employeeRepository.updateSalary(updatedSalary);
    }

    @Transactional
    public int deleteEmployee(int minSalary) {
        int employeesDeleted = employeeRepository.deleteEmployeeWithMinimumSalary(minSalary);
       return employeesDeleted;
    }

    public List<EmployeeDto> showSinghNamedEmployee() {
        List<EmployeeDto> employeeDtos=new ArrayList<>();
        List<Object[]> employeesNameArray = employeeRepository.showUsersWithLastNameSingh();
        System.out.println(employeesNameArray);
        for (Object[] objects : employeesNameArray) {
            System.out.println("hello");
            System.out.println("Id = " + objects[0] + ", First Name = " + objects[1] + ", Age = " + objects[2]);
        }
        for (Object[] objects : employeesNameArray) {
            System.out.println("hye");
            EmployeeDto employeeDto = new EmployeeDto();

            employeeDto.setId((Integer) objects[0]);
            System.out.println(employeeDto.getId());
            employeeDto.setFirstName((String) objects[1]);
            employeeDto.setAge((Integer) objects[2]);

            employeeDtos.add(employeeDto);
        }

        return employeeDtos;
    }

    @Transactional
    public int deleteAgedEmployee(int age) {
        int numberOfEmployeesDeleted = employeeRepository.deleteEmployeeWithAgeGreaterThan45(age);
        System.out.println("Number of employee deleted:" + numberOfEmployeesDeleted);
        return numberOfEmployeesDeleted;
    }

    @Transactional
    public void updateLowerSalariedEmployee(int newSalary) {
        int averageSalary = employeeRepository.findAverageSalary();

       employeeRepository.updateEmployeeHavingLessThanAverageSalary(newSalary, averageSalary);

    }


}


