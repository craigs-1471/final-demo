package com.gss.finaldemo.config.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_profiles")
@Builder
public class EmployeeProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String address;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "employeeProfile")
    private Employee employee;

    public EmployeeProfile(String email, String address, Employee employee) {
        this.email = email;
        this.address = address;
        this.employee = employee;
    }

    public EmployeeProfile(String email, String address) {
        this.email = email;
        this.address = address;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
