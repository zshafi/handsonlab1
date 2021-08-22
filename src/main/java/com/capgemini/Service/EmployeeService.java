package com.capgemini.Service;

import java.util.List;
import java.util.Optional;

import com.capgemini.domain.Employee;

public interface EmployeeService {
	
List <Employee> findAll();
List<Employee> save(Employee employee);
void updateEmployee(Employee employee, long id);
void deleteEmployeeById(long id);
public Optional<Employee> getById(long id);

}
