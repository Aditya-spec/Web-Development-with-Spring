package com.jpa1.SpringJpa1.controller;

public class Dummy {
    /*
package com.example.Spring_Data_Jpa_Using_Hibernate.EmployeeDataJPA;

import com.example.Spring_Data_Jpa_Using_Hibernate.EmployeeDataJPA.entities.Employee;
import com.example.Spring_Data_Jpa_Using_Hibernate.EmployeeDataJPA.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EmployeeDataJpaApplicationTests {
    @Autowired
    EmployeeRepository employeeRepository;


    void contextLoads() {
    }


    public void testCreate() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Alpha");
        employee.setAge(22);
        employee.setLocation("Delhi");
        employeeRepository.save(employee);
    }


    public void testRead() {
        Employee employee = employeeRepository.findById(2).get();
        assertNotNull(employee);
        assertEquals("Bravo", employee.getName());
    }


    public void testUpdate() {
        Employee employee = employeeRepository.findById(2).get();
        employee.setAge(44);
        employeeRepository.save(employee);
    }


    public void testDelete() {
        if (employeeRepository.existsById(1))
            System.out.println("Deleting a repository");
        employeeRepository.deleteById(1);
    }


    public void testCount() {
        System.out.println("Count is:" + employeeRepository.count());
    }


    public void testFindByName() {
        List<Employee> employeeList = employeeRepository.findByName("Bravo");
        employeeList.forEach(e -> System.out.println(e.getId()));
    }


    public void testFindByAgeBetween() {
        List<Employee> employeeList = employeeRepository.findByAgeBetween(28, 42);
        employeeList.forEach(e -> System.out.println(e.getId()));
    }


    public void testFindByNameLike() {
        List<Employee> employeeList = employeeRepository.findByNameLike("B%");
        employeeList.forEach(e -> System.out.println(e.getId()));
    }


    public void testFindAllPagingAndSorting() {
        Pageable pageable = PageRequest.of(0, 5, Sort.Direction.ASC, "age");
        employeeRepository.findAll(pageable).forEach(p -> System.out.println(p.getName() + ":" + p.getAge()));
    }
}
*/

}
