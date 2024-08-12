package Springboot_DataIntegrityViolationException.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "employee")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmpId", unique = true, updatable = false)
    int empid;
    @Column(name = "EmpName", updatable = true, nullable = false)
    @NotBlank(message = "Name cannot be blank")
    String empname;
    @Column(name = "EmpPhoneNo", updatable = true, unique = true)
    @NotEmpty(message = "Please enter your mobile number")
    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "mobile number should be 10 digits")
    String phoneno;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}
