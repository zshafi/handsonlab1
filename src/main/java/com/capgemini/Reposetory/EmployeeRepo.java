package com.capgemini.Reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.domain.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	List<Employee> findByEmailAndFirstName(String email, String firstName);
	
	@Query(nativeQuery = true, value = "select * from employee where firstname like ':start%'")
	List<Employee> findByfristnamek(@Param("start") String start);
}
