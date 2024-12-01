package com.example.service;

import com.example.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Optional<Employee> findById(Long id);
    Page<Employee> findAll(Pageable pageable);
    void deleteById(Long id);
}
