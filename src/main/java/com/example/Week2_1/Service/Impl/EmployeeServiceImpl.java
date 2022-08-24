package com.example.Week2_1.Service.Impl;

import com.example.Week2_1.Repository.DepartmentRepository;
import com.example.Week2_1.Repository.EmpoyeeRepository;
import com.example.Week2_1.Service.EmployeeService;
import com.example.Week2_1.entity.Department;
import com.example.Week2_1.entity.Employee;
import com.example.Week2_1.entity.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmpoyeeRepository employeeRepository;
    DepartmentRepository departmentRepository;
    @Override
    public Employee CreateEmployee(Employee employee)
    {


            return employeeRepository.save(employee);


    }

    @Override
    public List<Employee> getAllEmployee()
    {
        return employeeRepository.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public Optional<Employee> getEmployeeById(long id)
    {
        return employeeRepository.findById(id);
    }
    @Override
    public String UpdateEmployee(Employee employee,long id)
    {
        Optional<Employee> foundedEmployee= employeeRepository.findById(id);
        if(!foundedEmployee.isEmpty())
        {
            employee.setEmployeeId(id);
            employeeRepository.save(employee);
            return "Update success";
        }
        else
        {
            return "Employee is not exist";
        }
    }
    @Override
    public String DeleteEmployee( long id)
    {
        Boolean IsExistDeletedEmployee=employeeRepository.existsById(id);
        if(IsExistDeletedEmployee)
        {
            employeeRepository.deleteById(id);
            return "Delete success";
        }
        else
        {
            return "The Deleted Department is not existed";
        }
    }
}
