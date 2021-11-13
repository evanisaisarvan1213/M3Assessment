package com.cg.niit.question2.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@Table(name="salariedemployee")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="employeeId")
public class SalariedEmployee 
{
	@Id
	@Column(name="employee_id")
	int employeeId;
	
	@Column(name="salary")
	double salary;
	
	@Column(name="employee_name")
	String employeeName;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
	@JoinColumn(name="dept_no")
	Department department;
	
	public SalariedEmployee()  {}

	public SalariedEmployee(int employeeId, double salary, String employeeName) {
		this.employeeId = employeeId;
		this.salary = salary;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
