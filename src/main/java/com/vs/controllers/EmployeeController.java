package com.vs.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.pojo.Employee;
import com.vs.service.EmployeeService;

@RestController
public class EmployeeController {
	
//	@Autowired
//	private DataSource dataSource;
	
	
	
	//Auto wiring the service class
	
	@Autowired
	private EmployeeService employeeService;
	@RequestMapping("/getEmployees")
	public List<Employee> getAllEmployees() throws SQLException{
		
		
		List<Employee> employees = employeeService.getAllEmployees();
		return employees;
	}
//		List<Employee> employees =new ArrayList<Employee>();
////		Connection con = dataSource.getConnection();
////		Statement st =con.createStatement();
////		ResultSet rs =st.executeQuery("select * from employee");   
////		
////		while(rs.next()) {
////			Employee emp =new Employee();
////			emp.setId(rs.getInt(1));
////			emp.setName(rs.getString(2));
////			emp.setSalary(rs.getInt(3));
////			employees.add(emp);
////			
////		}
//		return employees;
//		
//	}

}
