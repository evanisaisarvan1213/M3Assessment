package com.cg.niit.question2.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.niit.question2.entity.Department;
import com.cg.niit.question2.repository.DepartmentRepository;
@Service
public class DepartmentService 
{
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Transactional(readOnly=true)
	public Department getDepartment(int departmentNo)
	{
		Optional<Department> dep = departmentRepository.findById(departmentNo);
		if(dep!=null)
			return dep.get();
		throw new RuntimeException("Department Not Found");
	}
	
	@Transactional
	public boolean addDepartments(Department department)
	{
		Department department1 = departmentRepository.save(department);
		return department1!=null;
	}
	
	@Transactional
	public void deleteDepartmentById(int departmentNo)
	{
		departmentRepository.deleteById(departmentNo);
	}
	
}
