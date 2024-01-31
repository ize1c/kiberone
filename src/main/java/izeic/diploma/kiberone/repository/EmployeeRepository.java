package izeic.diploma.kiberone.repository;

import izeic.diploma.kiberone.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
