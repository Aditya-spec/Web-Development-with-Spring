package com.example.SpringBoot.RestServices.Employee;


import com.example.SpringBoot.RestServices.Exceptions.UserNotfoundException;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@Api(description = "It will handle all the requests and gives the appropriate response")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeDao;


    @Autowired
    private MessageSource messageSource;

    @GetMapping("/employee/{id}")
    @ApiOperation(value = "FETCH the employee having particular id",
            response = EntityModel.class)
    public EntityModel<Employee> getOneEmployee(@PathVariable Integer id) {
        Employee employee = employeeDao.findEmployee(id);
        if (employee.equals(null)) {
            throw new UserNotfoundException("id:" + id);
        }
        EntityModel<Employee> employeeEntityModel = new EntityModel<Employee>(employee);
        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).showEmployeeDetails());
        employeeEntityModel.add(linkTo.withRel("all Users"));
        return employeeEntityModel;
    }


    @PostMapping("/employee/filter/dynamic")
    public MappingJacksonValue dynamicFilter(@Valid @RequestBody Employee newEmployee) {

        Employee savedEmployee = employeeDao.saveDetails(newEmployee);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("age", "name");

        FilterProvider filters = new SimpleFilterProvider().addFilter("EmployeeFilter", filter);
        MappingJacksonValue mapping = new MappingJacksonValue(savedEmployee);
        mapping.setFilters(filters);
        return mapping;
    }


    @GetMapping("/employee/greetings/{name}")
    @ApiOperation(value = "Returns the internationalized hello message",
            response = String.class)
    public String employeeGreetingsInternationalized(@PathVariable String name) {
        String localeMessage = messageSource.getMessage("hello.message", null,
                LocaleContextHolder.getLocale());
        return localeMessage + " " + name;
    }

    @GetMapping("/employee")
    @ApiOperation(value = "Returns all the employee ",
            response = Employee.class)
    public List<Employee> showEmployeeDetails() {
        List<Employee> employees = employeeDao.showDetails();
        return employees;
    }

    @GetMapping("/employee-Even")
    @ApiOperation(value = "Returns all the employee with even ids ",
            response = Employee.class)
    public List<Employee> showEvenEmployeeDetails() {
        List<Employee> employees = employeeDao.showEvenDetails();
        return employees;
    }

    //Using Param
    @GetMapping(value = "/employee/param", params = "version=1")
    @ApiOperation(value = "Api calling using param and returns  the employee ",
            response = Employee.class)
    public List<Employee> param1() {
        List<Employee> employees = employeeDao.showDetails();
        return employees;
    }

    @GetMapping(value = "/employee/param", params = "version=2")
    @ApiOperation(value = "Api calling using param and Returns all the even employee ",
            response = Employee.class)
    public List<Employee> param2() {
        List<Employee> employees = employeeDao.showEvenDetails();
        return employees;
    }
//

    //Custom Header
    @GetMapping(value = "/employee/header", headers = "API-VERSION=1")
    @ApiOperation(value = "Custome header Api and Returns all the employee ",
            response = Employee.class)
    public List<Employee> header1() {
        List<Employee> employees = employeeDao.showDetails();
        return employees;
    }

    @GetMapping(value = "/employee/header", headers = "API-VERSION=2")
    @ApiOperation(value = "Custome header Api and Returns all the even employee ",
            response = Employee.class)
    public List<Employee> header2() {
        List<Employee> employees = employeeDao.showEvenDetails();
        return employees;
    }

    //MIME
    @GetMapping(value = "/employee/produces", produces = "application/vnd.company.app-v1+json")
    @ApiOperation(value = "MIME type Api and Returns all the employee ",
            response = Employee.class)
    public List<Employee> produces1() {
        List<Employee> employees = employeeDao.showDetails();
        return employees;
    }

    @GetMapping(value = "/employee/produces", produces = "application/vnd.company.app-v2+json")
    @ApiOperation(value = "MIME Api and Returns all the even employee ",
            response = Employee.class)
    public List<Employee> produces2() {
        List<Employee> employees = employeeDao.showEvenDetails();
        return employees;
    }


    @DeleteMapping("/employee/{id}")
    @ApiOperation(value = "Delete the employee with particular id ",
            response = Employee.class)
    public Employee deleteEmployee(@PathVariable Integer id) {
        Employee employee = employeeDao.deleteEmployee(id);
        if (employee == null) {
            throw new UserNotfoundException("id:" + id);
        }
        return employee;
    }

    @PostMapping("/employee")
    @ApiOperation(value = "Creates an employee  ",
            response = Employee.class)
    public ResponseEntity<Object> saveEmployee(@Valid @RequestBody Employee employee) {
        Employee employee1 = employeeDao.saveDetails(employee);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(employee1.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @PostMapping("/employee/filter/static")
    @ApiOperation(value = "Shows static filtering",
            response = Employee.class)
    public Employee saveEmployeeFilterStatic(@Valid @RequestBody Employee employee) {
        Employee employee1 = employeeDao.saveDetails(employee);
        return employee1;
    }


    @PutMapping("/employee/{id}")
    @ApiOperation(value = "Edit the existing employee ",
            response = Employee.class)
    public Employee updateEmployee(@PathVariable Integer id, @Valid @RequestBody Employee employee) {
        Employee employee1 = employeeDao.findEmployee(id);
        if (employee1.equals(null)) {
            throw new UserNotfoundException("id:" + id);
        }
        employee1.setAge(employee.getAge());
        employee1.setName(employee.getName());
        return employee1;
    }
}





