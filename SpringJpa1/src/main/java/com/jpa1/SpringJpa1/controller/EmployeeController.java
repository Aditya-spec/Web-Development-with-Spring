package com.jpa1.SpringJpa1.controller;

import com.jpa1.SpringJpa1.entities.Employee;
import com.jpa1.SpringJpa1.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/show/{id}")
    public Employee readEmployee(@PathVariable Integer id) {
        Employee employee = employeeService.read(id);
        return employee;
    }

    @PostMapping("/create")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.create(employee);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        Employee employee1 = employeeService.update(id, employee);
        return employee1;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        Boolean result = employeeService.delete(id);
        if (result)
            return "deletion succesful";
        else
            return "not succesful";

    }

    @GetMapping("/count")
    public int employeeCount() {
        int count = employeeService.countEmp();
        return count;
    }


    @GetMapping("/find/{name}")
    public List<Employee> byName(@PathVariable String name) {
        List<Employee> employee = employeeService.find(name);
        return employee;
    }

    @GetMapping("/find/name/likeA")
    public List<Employee> findNameLike() {
        List<Employee> employeeList = employeeService.findEmpNameLike();
        return employeeList;
    }

    @GetMapping("/find/age")
    public List<Employee> findEmployee(){
        List<Employee> employeeList=employeeService.findEmp();
    return employeeList;
    }

    @GetMapping("/paging")
    public List<Employee> paging(){
    List<Employee> employeeList=employeeService.pageAndSort();
    return employeeList;
    }
}
