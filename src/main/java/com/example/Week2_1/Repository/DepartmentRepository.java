package com.example.Week2_1.Repository;

import  com.example.Week2_1.entity.Department;
import  com.example.Week2_1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {


}
