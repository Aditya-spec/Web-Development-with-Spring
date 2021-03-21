package com.jpa1.SpringJpa1.services;


import com.jpa1.SpringJpa1.entities.Employee;
import com.jpa1.SpringJpa1.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;

    public void create(Employee employee) {
        repository.save(employee);
    }

    public Employee read(int id) {
        Employee employee = repository.findById(id).get();
        return employee;
    }


    public Employee update(Integer id, Employee employee) {
        int age = employee.getAge();
        String location = employee.getLocation();
        String name = employee.getName();
        Employee employee1 = repository.findById(id).get();
        if (age > 0)
            employee1.setAge(age);
        if (!location.equals(null))
            employee1.setLocation(location);
        if (!name.equals(null))
            employee1.setName(name);
        repository.save(employee1);
        return employee1;
    }

    public Boolean delete(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else
            return false;
    }

    public int countEmp() {
        int number = (int) repository.count();
        return number;
    }

    public List<Employee> find(String name) {
        List<Employee> employeeList = repository.findByName(name);
        return employeeList;
    }

    public List<Employee> findEmpNameLike() {
        List<Employee> employeeList = repository.findByNameLike("A%");
        return employeeList;
    }

    public List<Employee> findEmp() {
        List<Employee> employeeList = repository.findByAgeBetween(10,34);
        return employeeList;
    }


    public List<Employee> pageAndSort() {
        Pageable pageable = PageRequest.of(0, 5, Sort.Direction.ASC, "age");
        List<Employee> employeeList= repository.findAll(pageable).stream().collect(Collectors.toList());
        return employeeList;

    }
}
