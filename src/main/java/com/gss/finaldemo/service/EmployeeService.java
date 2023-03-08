package com.gss.finaldemo.service;

import com.gss.finaldemo.config.model.Employee;
import com.gss.finaldemo.config.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
