package com.example.Week2_1.Service;

import com.example.Week2_1.entity.Employee;
import com.example.Week2_1.entity.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public Optional<Employee> getEmployeeById(long id);
    public Employee CreateEmployee(Employee employee);

    public String UpdateEmployee(Employee employee,long id);
    public String DeleteEmployee( long id);

}
