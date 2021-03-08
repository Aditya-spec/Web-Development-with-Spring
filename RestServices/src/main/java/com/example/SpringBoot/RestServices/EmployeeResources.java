package com.example.SpringBoot.RestServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmployeeResources {
    @Autowired
    public EmployeeDao employeeDao;

    @GetMapping("/Employee")
    public List<Employee> showEmployeeDetails() {
        List<Employee> employees =employeeDao.showDetails();
        return employees;
    }

    @GetMapping("/Employee/{id}")
    public Employee getOneEmployee(@PathVariable Integer id) {
        Employee employee =employeeDao.findEmployee(id);
        if (employee == null) {
            throw new UserNotfoundException("id:" + id);
        }
        return employee;
    }

    @DeleteMapping("/Employee/{id}")
    public Employee deleteEmployee(@PathVariable Integer id) {
        Employee employee =employeeDao.deleteEmployee(id);
        if (employee == null) {
            throw new UserNotfoundException("id:" + id);
        }
        return employee;
    }

    @PostMapping("/Employee")
    public ResponseEntity<Object> saveEmployee(@Valid @RequestBody Employee employee) {
        Employee employee1 =employeeDao.saveDetails(employee);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(employee1.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/Employee/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        Employee employee1 =employeeDao.findEmployee(id);
        if (employee == null) {
            throw new UserNotfoundException("id:" + id);
        }
        employee1.setAge(employee.getAge());
        employee1.setName(employee.getName());
        return employee1;
    }
}





