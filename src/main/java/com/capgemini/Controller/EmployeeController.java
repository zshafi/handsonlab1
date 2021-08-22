package com.capgemini.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Service.EmployeeService;
import com.capgemini.domain.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	
	@RequestMapping(path="/addemployee", method = RequestMethod.POST)
	public List<Employee> save(Employee employee){
	return	employeeService.save(employee);
		
	}
	
	@RequestMapping(path="/listofemployees", method = RequestMethod.GET)
	public List<Employee> findAllEmployee(){
		return employeeService.findAll();
	}
	
	@RequestMapping(path="/deleteemployee", method = RequestMethod.DELETE)
	public void delete(long id){
		employeeService.deleteEmployeeById(id);
		
	}
	@RequestMapping(path="/employee", method = RequestMethod.GET)
	public Optional<Employee> employeeById(Employee employee, long id){
		return employeeService.getById(id);
		
	}
}
