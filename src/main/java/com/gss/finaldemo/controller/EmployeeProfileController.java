package com.gss.finaldemo.controller;

import com.gss.finaldemo.config.model.EmployeeProfile;
import com.gss.finaldemo.service.EmployeeProfileService;
import com.gss.finaldemo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/employee-profiles")
public class EmployeeProfileController {
    private EmployeeProfileService employeeProfileService;
    @PostMapping
    public ResponseEntity<EmployeeProfile> addEmployeeProfile(@RequestBody EmployeeProfile employeeProfile) {
        employeeProfileService.saveEmployeeProfile(employeeProfile);
        return new ResponseEntity<>(employeeProfile, HttpStatus.CREATED);
    }
}
