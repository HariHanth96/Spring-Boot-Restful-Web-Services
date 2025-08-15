package com.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.practice.Model.Employee;

@Repository //annotation not needed
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
