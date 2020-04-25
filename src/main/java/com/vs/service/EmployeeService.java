package com.vs.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vs.pojo.Employee;
import com.vs.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	
//	@Autowired
//	private DataSource dataSource;
	
	
	
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> getAllEmployees() throws SQLException{
		
	List<Employee> employees =//repository.findAll();
			repository.getEmployeeBySal(2000);
				//
		return employees;
		
		
//		List<Employee> employees =new ArrayList<Employee>();
//		Connection con = dataSource.getConnection();
//		Statement st =con.createStatement();
//		ResultSet rs =st.executeQuery("select * from employee");   
//		
//		while(rs.next()) {
//			Employee emp =new Employee();
//			emp.setId(rs.getInt(1));
//			emp.setName(rs.getString(2));
//			emp.setSalary(rs.getInt(3));
//			employees.add(emp);
//			
//		}
//		return employees;
		
	}

}
