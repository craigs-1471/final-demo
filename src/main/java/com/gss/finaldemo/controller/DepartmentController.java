package com.gss.finaldemo.controller;

import com.gss.finaldemo.config.model.Department;
import com.gss.finaldemo.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> addDepartment(@RequestBody Department dept) {
        departmentService.addDepartment(dept);
        return  new ResponseEntity<>(dept, HttpStatus.CREATED);
    }
}
