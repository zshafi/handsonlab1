package com.capgemini.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.Reposetory.EmployeeRepo;
import com.capgemini.domain.Employee;

public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public List<Employee> save(Employee employee) {
			employeeRepo.save(employee);
			return findAll();
	}

	@Override
	public void updateEmployee(Employee employee, long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeById(long id) {
		employeeRepo.deleteById(id);
	}

	@Override
	public Optional<Employee> getById(long id) {
		
		return employeeRepo.findById(id);
	}

}
