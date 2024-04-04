package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.model.Employee;

@Service
public class EmployeeService {
	public Employee createEmployee(String empId, String fname, String sname) {
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setFirstName(fname);
		emp.setLastName(sname);
		return emp;
	}

	public void deleteEmployee(String empId) {
	}
}
