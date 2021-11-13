package com.cg.niit.question2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.niit.question2.entity.Department;
public interface DepartmentRepository extends JpaRepository<Department,Integer>
{

}
