package org.example.backend.repo;

import org.example.backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    @Transactional
    @Modifying
    void deleteEmployeeById(Long id);


    Optional<Employee> findEmployeeByEmail(String email);
    Optional<Employee> findEmployeeById(Long id);
}
