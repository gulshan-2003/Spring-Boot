package org.codingwallah.em_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    List<Employee> employees = new ArrayList<>();
    @Override
    public String createEmployee(Employee employee) {
        employees.add(employee);
        return "Saved Successfully";
    }

    @Override
    public List<Employee> readEmployees() {
       return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
     boolean removed = employees.removeIf(employee -> employee.getId().equals(id));
        return removed;
    }

}
