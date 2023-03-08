package com.gss.finaldemo.config.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_profile_id")
    private EmployeeProfile employeeProfile;

    public Employee(String name, EmployeeProfile userProfile) {
        this.name = name;
        this.employeeProfile = userProfile;
    }

    public Employee(String name) {
        this.name = name;
    }
}
