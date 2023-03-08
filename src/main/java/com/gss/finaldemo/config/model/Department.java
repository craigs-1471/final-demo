package com.gss.finaldemo.config.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="department_id")
    private Long id;
    private String deptName;
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="dept_emp_fid", referencedColumnName = "department_id")
    List<Employee> comments = new ArrayList<>();

    public Department(String deptName, String description) {
        this.deptName = deptName;
        this.description = description;
    }
}
