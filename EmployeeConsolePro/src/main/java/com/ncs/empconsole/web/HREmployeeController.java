package com.ncs.empconsole.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ncs.empconsole.model.Employee;
import com.ncs.empconsole.service.EmployeeService;

@RestController
@RequestMapping("/empconsole/hr")
public class HREmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	public HREmployeeController() {
		System.out.println("HR Employee Controller constructor called");
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return empService.getAllEmployees();
	}

	@GetMapping("/employee/id/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		System.out.println("path varible : "+id);
		return empService.getEmployeeDetails(id);
	}
	
	@GetMapping("/employee") // ..../employee/hr/employee?name=ramesh
	public Employee getEmployeeByName(@RequestParam String name)
	{
		System.out.println("path varible : "+name);
		Employee e =  empService.getEmployeeDetails(name);
		System.out.println(e);
		return e;
	}
	
	@PutMapping("/employee/{searchEmpId}/project")
	public Employee updateEmployee(@PathVariable int searchEmpId,@RequestParam int projectId)
	{
		return empService.updateProject(searchEmpId, projectId);
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e)
	{
		
		System.err.println(" -->> 1) From Web :- "+e);
		boolean status = empService.addEmployee(e);
		System.err.println(" -->> 4) add employee Rest controller status :- "+status);
		return (status == true)?e:null;
	}
	
}//end class




















