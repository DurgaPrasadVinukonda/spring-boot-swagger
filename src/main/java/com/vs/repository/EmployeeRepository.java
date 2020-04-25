package com.vs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
//This class interact with the Employee Table

import com.vs.pojo.Employee;
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Integer>{
	
	@Query("from  Employee where salary > ?1")
	List<Employee> getEmployeeBySal(int salary);

}
