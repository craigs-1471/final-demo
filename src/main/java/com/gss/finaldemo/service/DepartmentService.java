package com.gss.finaldemo.service;

import com.gss.finaldemo.config.model.Department;
import com.gss.finaldemo.config.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    public Department addDepartment(Department dept) {
        return departmentRepository.save(dept);
    }
}
