package Springboot_DataIntegrityViolationException.Repository;

import Springboot_DataIntegrityViolationException.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
}
