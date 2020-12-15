package io.github.jmgarridopaz.taskmanagement.adapters.forgettingemployees.web;

import java.util.List;

import io.github.jmgarridopaz.taskmanagement.hexagon.acl.EmployeeDto;
import io.github.jmgarridopaz.taskmanagement.hexagon.acl.ForGettingEmployees;


public class ForGettingEmployeesWebAdapter implements ForGettingEmployees {

	private final String restApiUrl;
	
	
	public ForGettingEmployeesWebAdapter(String restApiUrl) {
		this.restApiUrl = restApiUrl;
	}

	@Override
	public List<Employee> employeesByDepartmentId ( String departmentId ) {
		// Makes a http request to the rest api method
		// Gets the JSON data
		// Translate JSON into Employee objects
		throw new RuntimeException("Web Adapter Not Implemented");
	}
	
}
