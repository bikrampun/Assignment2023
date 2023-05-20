package com.example.employeeservice.service;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.model.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeDao service;
    @GetMapping("/employees")
    public List<Employee> getAll() {
        return service.getAllEmployee();
    }

    @GetMapping("/employees/{empId}")
    public Employee getEmployeeById(@PathVariable int empId) {
        Employee employee = service.getEmployeeById(empId);
        return employee;
    }

    @PostMapping("/employees/user")
    public void saveEmployee(@RequestBody Employee emp) {
        service.saveEmployee(emp);
    }

    @DeleteMapping("/employees/delete/{empId}")
    public void deleteEmployee(@PathVariable int empId) {
        Employee emp = service.deleteEmployee(empId);
    }
}
