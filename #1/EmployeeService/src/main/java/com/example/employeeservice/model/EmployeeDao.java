package com.example.employeeservice.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeDao {
    static List<Employee> list = new ArrayList<>();

    static {
        list.add(new Employee(11,"Bikram","bikram@gmail.com"));
        list.add(new Employee(12,"Ram","ram@gmail.com"));
        list.add(new Employee(13,"Bibek","bibek@gmail.com"));
    }

    public static List<Employee> getAllEmployee() {
        return list;
    }

    public Employee getEmployeeById(int empId) {
        return list.stream()
                .filter(emp -> emp.getEmployeeId()==empId)
                .findAny()
                .orElse(null);
    }

    public void saveEmployee(Employee emp) {
        //emp.setEmployeeId(list.size()+1);
        list.add(emp);
    }

    public Employee deleteEmployee(int empId) {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (empId == emp.getEmployeeId()) {
                iterator.remove();
                return emp;
            }
        }
        return null;
    }
}
