package com.example.SpringDataPart2.JPQl;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class JpQlApplication {

    public static void main(String[] args) {
         SpringApplication.run(JpQlApplication.class, args);
       /* EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        EmployeeSalariedService employeeSalariedService = applicationContext.getBean(EmployeeSalariedService.class);
        EmployeeSingleTableInheritanceService employeeSingleTableInheritanceService=applicationContext.getBean(EmployeeSingleTableInheritanceService.class);
        EmployeeForTableStrategyService employeeForTableStrategyService=applicationContext.getBean(EmployeeForTableStrategyService.class);
        EmployeeForJoinedInheritanceService employeeForJoinedInheritanceService=applicationContext.getBean(EmployeeForJoinedInheritanceService.class);
*/
       // employeeService.set0();
       // employeeService.findFirstAndLastName();
       // employeeService.setNewSalary(22000);
        /*employeeService.deleteEmployee(10000);
        employeeService.showSinghNamedEmployee();select avg(emp_salary) as avg_salary from employee_table
        employeeService.deleteAgedEmployee(45);

        employeeSalariedService.createEmployeeSalaried();

        employeeSingleTableInheritanceService.createEmployee();
        employeeForTableStrategyService.createEmployeeforTableStrategy();
        employeeForJoinedInheritanceService.createEmployeeUsingJoined();*/
      //  employeeService.updateLowerSalariedEmployee(30000);
    }

}
