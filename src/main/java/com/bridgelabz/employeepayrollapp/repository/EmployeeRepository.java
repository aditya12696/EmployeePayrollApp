package com.bridgelabz.employeepayrollapp.repository;

import com.bridgelabz.employeepayrollapp.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
