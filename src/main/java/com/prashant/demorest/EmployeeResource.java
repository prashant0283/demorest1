package com.prashant.demorest;

import java.util.ArrayList;
import java.util.List;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("employees")
public class EmployeeResource {
	
	EmployeeDao dao = new EmployeeDao();
	
	@GET 
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List <Employee> getEmployees() {
		return dao.getEmployees();

	}
	
	@GET 
	@Path("employee/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Employee getEmployee(@PathParam("id") int id) {
		return dao.getEmployee(id);

	}
	
	
	@POST
	@Path("employee")
	public Employee createEmployee(Employee e1){
		System.out.println("Print employee object"+ e1);
		dao.createEmployee(e1);
		return e1;
	}
	
	

}
