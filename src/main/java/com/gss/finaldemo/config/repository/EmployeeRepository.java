package com.gss.finaldemo.config.repository;

import com.gss.finaldemo.config.model.Employee;
import com.gss.finaldemo.config.model.EmployeeProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
