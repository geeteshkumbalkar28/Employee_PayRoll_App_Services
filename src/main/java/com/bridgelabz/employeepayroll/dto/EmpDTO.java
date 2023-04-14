package com.bridgelabz.employeepayroll.dto;

import lombok.ToString;


public class EmpDTO {
    public String name;
    public double salary;

    @Override
    public String toString() {
        return "EmpDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
