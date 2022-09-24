package org.ildus.akhmadiev.spring.dao;

import org.ildus.akhmadiev.spring.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    Employee getEmployee(int id);
}
