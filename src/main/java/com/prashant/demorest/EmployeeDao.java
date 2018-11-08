package com.prashant.demorest;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	List <Employee> emp;
	
	public EmployeeDao() {
		
		emp = new ArrayList<>();
		
		Employee e1 = new Employee();
		e1.setEmpID(1111);
		e1.setEmpName("Prashant");
		
		Employee e2 = new Employee();
		e2.setEmpID(2222);
		e2.setEmpName("Kumar");
		
		emp.add(e1);
		emp.add(e2);
		
	}
	
	public List <Employee> getEmployees(){
		
		return emp;
	}
	
	public Employee getEmployee (int id) {
		for (Employee e: emp) {
			if (e.getEmpID()== id)
			return e;
		}
		return new Employee();
	}

	public void createEmployee(Employee e1) {
		emp.add(e1);
		
		
	}
}
