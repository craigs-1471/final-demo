package com.gss.finaldemo.service;

import com.gss.finaldemo.config.model.EmployeeProfile;
import com.gss.finaldemo.config.repository.EmployeeProfileRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeProfileService {
    private EmployeeProfileRepository employeeProfileRepository;
    public EmployeeProfile saveEmployeeProfile(EmployeeProfile employeeProfile) {
        return employeeProfileRepository.save(employeeProfile);
    }
}
