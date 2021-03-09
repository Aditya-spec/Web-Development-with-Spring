package com.example.SpringBoot.RestServices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class EmployeeResources {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/employee/{id}")
    public EntityModel<Employee> getOneEmployee(@PathVariable Integer id) {
        Employee employee = employeeDao.findEmployee(id);
        if (employee == null) {
            throw new UserNotfoundException("id:" + id);
        }
        EntityModel<Employee> employeeEntityModel = new EntityModel<Employee>(employee);
        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).showEmployeeDetails());
        employeeEntityModel.add(linkTo.withRel("all Users"));
        return employeeEntityModel;
    }

   /*  @PostMapping("/employee-filter-dynamic")
    public MappingJacksonValue saveEmployeeFilterDynamic(@Valid @RequestBody Employee employee) {
        Employee employee1 = employeeDao.saveDetails(employee);
        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("name","age");
        FilterProvider filters=new SimpleFilterProvider().addFilter("SomeFilter",filter);
        MappingJacksonValue mapping=new MappingJacksonValue(employee1);
        return mapping;
    }*/


    @GetMapping("/employee/greetings/{name}")
    public String employeeGreetingsInternationalized(@PathVariable String name) {
        String localeMessage = messageSource.getMessage("hello.message", null,
                LocaleContextHolder.getLocale());
        return localeMessage + " " + name;
    }

    @GetMapping("/employee")
    public List<Employee> showEmployeeDetails() {
        List<Employee> employees = employeeDao.showDetails();
        return employees;
    }

    @GetMapping("/employee-Even")
    public List<Employee> showEvenEmployeeDetails() {
        List<Employee> employees = employeeDao.showEvenDetails();
        return employees;
    }

    //Using Param
    @GetMapping(value = "/employee/param", params = "version=1")
    public List<Employee> param1() {
        List<Employee> employees = employeeDao.showDetails();
        return employees;
    }

    @GetMapping(value = "/employee/param", params = "version=2")
    public List<Employee> param2() {
        List<Employee> employees = employeeDao.showEvenDetails();
        return employees;
    }
//

    //Custom Header
    @GetMapping(value = "/employee/header", headers = "API-VERSION=1")
    public List<Employee> header1() {
        List<Employee> employees = employeeDao.showDetails();
        return employees;
    }

    @GetMapping(value = "/employee/header", headers = "API-VERSION=2")
    public List<Employee> header2() {
        List<Employee> employees = employeeDao.showEvenDetails();
        return employees;
    }

    //MIME
    @GetMapping(value = "/employee/produces", produces = "application/vnd.company.app-v1+json")
    public List<Employee> produces1() {
        List<Employee> employees = employeeDao.showDetails();
        return employees;
    }

    @GetMapping(value = "/employee/produces", produces = "application/vnd.company.app-v2+json")
    public List<Employee> produces2() {
        List<Employee> employees = employeeDao.showEvenDetails();
        return employees;
    }


    @DeleteMapping("/employee/{id}")
    public Employee deleteEmployee(@PathVariable Integer id) {
        Employee employee = employeeDao.deleteEmployee(id);
        if (employee == null) {
            throw new UserNotfoundException("id:" + id);
        }
        return employee;
    }

    @PostMapping("/employee")
    public ResponseEntity<Object> saveEmployee(@Valid @RequestBody Employee employee) {
        Employee employee1 = employeeDao.saveDetails(employee);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(employee1.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @PostMapping("/employee/filter/static")
    public Employee saveEmployeeFilterStatic(@Valid @RequestBody Employee employee) {
        Employee employee1 = employeeDao.saveDetails(employee);
        return employee1;
    }


    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @Valid @RequestBody Employee employee) {
        Employee employee1 = employeeDao.findEmployee(id);
        if (employee == null) {
            throw new UserNotfoundException("id:" + id);
        }
        employee1.setAge(employee.getAge());
        employee1.setName(employee.getName());
        return employee1;
    }
}





