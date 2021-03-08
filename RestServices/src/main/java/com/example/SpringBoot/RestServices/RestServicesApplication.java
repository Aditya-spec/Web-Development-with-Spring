package com.example.SpringBoot.RestServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestServicesApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(RestServicesApplication.class, args);
        EmployeeDao employeeDaoService = applicationContext.getBean(EmployeeDao.class);
       /* System.out.println(employeeDaoService.showDetails());
        System.out.println(employeeDaoService.saveDetails(new Employee(4, "Delta", 29)));
        System.out.println(employeeDaoService.findEmployee(4));
*/
    }

}
