package com.cg.niit.question2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.niit.question2.entity.Department;
import com.cg.niit.question2.service.DepartmentService;
@RestController
@RequestMapping("/Department")
public class DepartmentController 
{
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping(value="/{departmentNo}",produces="application/json")
	public ResponseEntity<Department> getDepartmentDetails(@PathVariable int departmentNo)
	{
		Department dept = departmentService.getDepartment(departmentNo);
		return new ResponseEntity<Department>(dept,HttpStatus.OK);
	}
	
	@PostMapping(consumes="application/json")
	public HttpStatus addDepartmentDetails(@RequestBody Department department)
	{
		if(departmentService.addDepartments(department))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
	
	@DeleteMapping(value="/{departmentNo}")
	public HttpStatus deleteByDepartmentId(@PathVariable int departmentNo)
	{
		departmentService.deleteDepartmentById(departmentNo);
		return HttpStatus.OK;
	}
	
}
