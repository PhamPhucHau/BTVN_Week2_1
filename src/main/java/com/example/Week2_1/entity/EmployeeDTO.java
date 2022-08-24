package com.example.Week2_1.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Date;

@Data
@Getter
@Setter
public class EmployeeDTO {
    private Long employeeId;
    private String name;
    private Date birthDate;
    private boolean gender;
    private Long departmentId;

}
