package com.example.Week2_1.Controller;

import com.example.Week2_1.Service.DepartmentService;
import com.example.Week2_1.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @PostConstruct
    public void Init()
    {
        departmentService.InitDepartment();
    }
    @GetMapping("/")
    public List<Department> getAllDepartment()
    {
        System.out.println(departmentService.getAllDepartment());
        return departmentService.getAllDepartment();

    }
    @GetMapping("/{id}/")
    public Optional<Department> getDepartmentById(@PathVariable("id") long id)
    {
        return departmentService.findDepartmentById(id);
    }
    @PostMapping("/create")
            public Department CreateNewDepartment(@RequestBody Department department)
    {
       return departmentService.CreateDepartment(department);
    }
    @PutMapping("/{id}")
    public void UpdateDepartment(@RequestBody Department department,@PathVariable("id") long id)
    {
        departmentService.UpdateDepartment(department,id);
    }
    @DeleteMapping("/{id}")
    public void DeleteDepartment(@PathVariable("id") long id)
    {
        departmentService.DeleteDepartment(id);
    }
}
