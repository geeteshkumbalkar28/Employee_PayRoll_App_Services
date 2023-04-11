package com.bridgelabz.employeepayroll.model;

import com.bridgelabz.employeepayroll.dto.EmpDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EmpData {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double salary;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
