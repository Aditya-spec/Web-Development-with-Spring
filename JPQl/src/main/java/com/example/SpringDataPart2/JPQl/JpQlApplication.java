package com.example.SpringDataPart2.JPQl;

import com.example.SpringDataPart2.JPQl.Service.ComponentMapping.EmployeeSalariedService;
import com.example.SpringDataPart2.JPQl.Service.JpqlAndnativeQueries.EmployeeService;
import com.example.SpringDataPart2.JPQl.Service.TableInheritance.EmployeeForTableStrategyService;
import com.example.SpringDataPart2.JPQl.Service.SingleTable.EmployeeSingleTableInheritanceService;
import com.example.SpringDataPart2.JPQl.Service.joinedInheritance.EmployeeForJoinedInheritanceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class JpQlApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(JpQlApplication.class, args);
        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        EmployeeSalariedService employeeSalariedService = applicationContext.getBean(EmployeeSalariedService.class);
        EmployeeSingleTableInheritanceService employeeSingleTableInheritanceService=applicationContext.getBean(EmployeeSingleTableInheritanceService.class);
        EmployeeForTableStrategyService employeeForTableStrategyService=applicationContext.getBean(EmployeeForTableStrategyService.class);
        EmployeeForJoinedInheritanceService employeeForJoinedInheritanceService=applicationContext.getBean(EmployeeForJoinedInheritanceService.class);

        /*employeeService.findFirstAndLastName();
        employeeService.setNewSalary(22000);
        employeeService.deleteEmployee(10000);
        employeeService.showSinghNamedEmployee();
        employeeService.deleteAgedEmployee(45);

        employeeSalariedService.createEmployeeSalaried();

        employeeSingleTableInheritanceService.createEmployee();
        employeeForTableStrategyService.createEmployeeforTableStrategy();
        employeeForJoinedInheritanceService.createEmployeeUsingJoined();*/
        employeeService.updateLowerSalariedEmployee(30000);
    }

}
