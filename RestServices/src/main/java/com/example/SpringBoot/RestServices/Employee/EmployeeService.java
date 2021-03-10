package com.example.SpringBoot.RestServices.Employee;

import com.example.SpringBoot.RestServices.Employee.Employee;
import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
@ApiModel(description = "All the methods that can be performed on Employee class's object")
public class EmployeeService {
    private static List<Employee> employeeList = new ArrayList<Employee>();
    private static int employeeCounter = 3;

    static {
        employeeList.add(new Employee(1, "Alpha", 26));
        employeeList.add(new Employee(2, "Bravo", 25));
        employeeList.add(new Employee(3, "Charlie", 21));
    }

    public List<Employee> showDetails() {
        return employeeList;
    }



    public List<Employee> showEvenDetails() {
        List<Employee> employeeList1 = new ArrayList<Employee>();
        for (Employee employee : employeeList) {
            if (employee.getId() % 2 == 0)
                employeeList1.add(employee);
        }
        return employeeList1;
    }


    public Employee saveDetails(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(++employeeCounter);
        }
        employeeList.add(employee);
        return employee;
    }

    public Employee findEmployee(Integer id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id)
                return employee;
        }
        return null;
    }

    public Employee deleteEmployee(Integer id) {
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                return employee;
            }

        }
        return null;
    }

}
