package com.example.SpringBoot.RestServices;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeDaoService {
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
