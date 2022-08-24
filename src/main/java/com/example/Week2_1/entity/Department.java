package com.example.Week2_1.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name="DEPARTMENT")
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue
    @Column(name="departmentId",nullable = false)
    private long id;
    @Column(name="departmentName",length = 64,nullable = false)
    private String department_name;
    @Column(name="description",length = 255,nullable = false)
    private String description;
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    private Collection<Employee> employees;
    public Department(String name,String description)
    {
        this.department_name=name;
        this.description=description;
    }
    public  Department()
    {

    }
}
