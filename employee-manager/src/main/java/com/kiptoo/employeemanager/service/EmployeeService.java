package com.kiptoo.employeemanager.service;

import java.util.List;

import com.kiptoo.employeemanager.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);

}
