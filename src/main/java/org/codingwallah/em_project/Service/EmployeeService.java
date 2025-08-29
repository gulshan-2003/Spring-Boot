package org.codingwallah.em_project.Service;

import java.util.List;

import org.codingwallah.em_project.Model.Employee;

public interface EmployeeService {
    
    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id, Employee employee);
    Employee readEmployee(Long id);
   
    
}
