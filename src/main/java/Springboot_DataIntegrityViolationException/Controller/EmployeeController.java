package Springboot_DataIntegrityViolationException.Controller;

import Springboot_DataIntegrityViolationException.Entity.Employee;
import Springboot_DataIntegrityViolationException.Repository.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController
{
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/test")
    public String test()
    {
        return "This is Data Integrity Violation test";
    }

    @PostMapping("/save")
    public Employee savedata(@Valid @RequestBody Employee employee)
    {
        employeeRepository.save(employee);
        return employee;
    }

    @GetMapping("/show")
    public List<Employee> showdata()
    {
        return employeeRepository.findAll();
    }

    @GetMapping("/byid/{empid}")
    public Optional<Employee> ById(@Valid @PathVariable int empid)
    {
        return employeeRepository.findById(empid);
    }
}
