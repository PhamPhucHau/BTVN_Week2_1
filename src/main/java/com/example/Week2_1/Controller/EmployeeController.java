package com.example.Week2_1.Controller;

import com.example.Week2_1.Service.DepartmentService;
import com.example.Week2_1.Service.EmployeeService;
import com.example.Week2_1.entity.Department;
import com.example.Week2_1.entity.Employee;
import com.example.Week2_1.entity.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    DepartmentService departmentService;

    @GetMapping("")
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") long id)
    {
        return employeeService.getEmployeeById(id);
    }
    //Ham nay con loi 
    @PostMapping("/create/{id}")
    public Employee CreateNewEmployee(@RequestBody Employee employee,@PathVariable("id") long id)
    {
        EmployeeDTO employeeDTO=new EmployeeDTO();
        employeeDTO.setEmployeeId(employee.getEmployeeId());
        employeeDTO.setName(employee.getName());
        employeeDTO.setGender(employee.getGender());
        employeeDTO.setBirthDate(employee.getBirthDate());
        employeeDTO.setDepartmentId(employeeDTO.getDepartmentId());
            return employeeService.CreateEmployee(employee);
    }
    @PutMapping("/{id}")
    public void UpdateEmployee(Employee employee,@PathVariable("id") long id)
    {
        employeeService.UpdateEmployee(employee,id);
    }
    @DeleteMapping("/{id}")
    public void DeleteEmployee(@PathVariable("id") long id)
    {
        employeeService.DeleteEmployee(id);
    }
}
