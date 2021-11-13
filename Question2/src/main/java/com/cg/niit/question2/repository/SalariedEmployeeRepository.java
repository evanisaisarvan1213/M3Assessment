package com.cg.niit.question2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.niit.question2.entity.SalariedEmployee;
public interface SalariedEmployeeRepository extends JpaRepository<SalariedEmployee, Integer>
{

}
