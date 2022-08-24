package com.example.Week2_1.Service;

import  com.example.Week2_1.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DepartmentService {

    public List<Department> getAllDepartment();
    public Department CreateDepartment(Department department);
    public Optional<Department> findDepartmentById(long department_id);
    public String UpdateDepartment(Department department,long id);
    public String DeleteDepartment(long id);
    public void InitDepartment();


}
