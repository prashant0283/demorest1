package com.prashant.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private String  EmpName;
	private int EmpID;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpID=" + EmpID + "]";
	}
	
}
