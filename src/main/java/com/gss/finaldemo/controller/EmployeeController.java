package com.gss.finaldemo.controller;

import com.gss.finaldemo.config.model.Employee;
import com.gss.finaldemo.config.model.EmployeeProfile;
import com.gss.finaldemo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;
    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }
    @PostMapping("add-with-profile")
    public ResponseEntity<String> addEmployeeWithProfile() {
        EmployeeProfile employeeProfile = EmployeeProfile.builder()
                .address("add-with-profile-latest")
                .email("email")
                .build();
        Employee employee = Employee.builder()
                .name("add-with-profile-latest")
                .employeeProfile(employeeProfile)
                .build();
        employeeProfile.setEmployee(employee);
        employeeService.saveEmployee(employee);
        return new ResponseEntity<>("Employee Added", HttpStatus.CREATED);
    }
}
