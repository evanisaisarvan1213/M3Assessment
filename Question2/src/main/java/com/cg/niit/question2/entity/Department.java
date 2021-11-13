package com.cg.niit.question2.entity;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@Table(name="department")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="departmentNo")
public class Department 
{
	@Id
	@Column(name="dept_no")
	int departmentNo;
	
	@Column(name="dept_name")
	String departmentName;
	
	@Column(name="dept_loc")
	String departmentLocation;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="department")
	List<SalariedEmployee> salariedEmployee;
	
	public Department()   {}

	public Department(int departmentNo, String departmentName, String departmentLocation,List<SalariedEmployee> salariedEmployee) {
		this.departmentNo = departmentNo;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
		this.salariedEmployee = salariedEmployee;
	}

	public int getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}

	public List<SalariedEmployee> getSalariedEmployee() {
		return salariedEmployee;
	}

	public void setSalariedEmployee(List<SalariedEmployee> salariedEmployee) {
		this.salariedEmployee = salariedEmployee;
	}
	
	
	
}
