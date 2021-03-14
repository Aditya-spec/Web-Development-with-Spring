package com.example.SpringDataPart2.JPQl.Service.JpqlAndnativeQueries;

import com.example.SpringDataPart2.JPQl.entities.JpqlAndNativeQuery.Employee;
import com.example.SpringDataPart2.JPQl.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void findFirstAndLastName() {
        List<Object> list = employeeRepository.findFirstNameLastNameSalaryGreaterThanAverage(Sort.by
                (new Sort.Order(Sort.Direction.ASC, "age"),
                        new Sort.Order(Sort.Direction.DESC, "salary")));
        list.stream().forEach(emp -> System.out.println(emp));
    }

    @Transactional
    public void setNewSalary(int updatedsalary) {
        employeeRepository.updateSalary(updatedsalary);
    }

    @Transactional
    public void deleteEmployee(int minsalary) {
        int i = employeeRepository.deleteEmployeeWithMinimumSalary(minsalary);
        System.out.println("Numbers of employee deleted:" + i);
    }

    public void showSinghNamedEmployee() {
        List<Object[]> employeesNameArray = employeeRepository.showUsersWithLastNameSingh();
        for (Object[] objects : employeesNameArray) {
            System.out.println("Id = " + objects[0] + ", First Name = " + objects[1] + ", Age = " + objects[2]);
        }
    }

    @Transactional
    public void deleteAgedEmployee(int age) {
      int numberOfEmployeesDeleted =  employeeRepository.deleteEmployeeWithAgeGreaterThan45(age);
        System.out.println("Number of employee deleted:"+numberOfEmployeesDeleted);
    }

    @Transactional
    public void updateLowerSalariedEmployee(int newSalary){
        int averageSalary = employeeRepository.findAverageSalary();
        System.out.println(averageSalary);

        employeeRepository.updateEmployeeHavingLessThanAveragesalary(newSalary, averageSalary);
        //employeeList.stream().forEach(e-> System.out.println(e));

    }


}


