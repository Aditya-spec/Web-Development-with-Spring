package com.example.SpringDataPart2.JPQl.controller;

import com.example.SpringDataPart2.JPQl.Service.JpqlAndnativeQueries.EmployeeService;
import com.example.SpringDataPart2.JPQl.entities.JpqlAndNativeQuery.EmployeeDto;
import com.example.SpringDataPart2.JPQl.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class JpqlController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/jpql/ques1")
    public List<Object> findFirstAndLast() {
        List<Object> employeeList = employeeService.findFirstAndLastName();
        return employeeList;
    }

    @GetMapping("/jpql/ques2/{salary}")
    public void updateSalary(@PathVariable Integer salary) {
         employeeService.updateLowerSalariedEmployee(salary);
    }

    @DeleteMapping("/jpql/ques3/{salary}")
    public String deleteEmployee(@PathVariable Integer salary) {
        int count = employeeService.deleteEmployee(salary);
        return "number of employees deleted = " + count;
    }

    @GetMapping("/native/ques1")
    public List<EmployeeDto> showEmp() {
        List<EmployeeDto> employeeDtos = employeeService.showSinghNamedEmployee();
        return employeeDtos;

    }

    @DeleteMapping("/native/ques2/{age}")
    public String deleteEmp(@PathVariable Integer age) {
        int deletedCount = employeeService.deleteAgedEmployee(age);
        return "employees deleted:" + deletedCount;
    }
}
