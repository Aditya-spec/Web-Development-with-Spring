package com.example.SpringBoot.RestServices;

import com.example.SpringBoot.RestServices.Employee.EmployeeService;
import io.swagger.annotations.ApiModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
@ApiModel(description = "Main class")
public class RestServicesApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(RestServicesApplication.class, args);
        EmployeeService employeeDaoService = applicationContext.getBean(EmployeeService.class);
       /* System.out.println(employeeDaoService.showDetails());
        System.out.println(employeeDaoService.saveDetails(new Employee(4, "Delta", 29)));
        System.out.println(employeeDaoService.findEmployee(4));
*/

    }
}


