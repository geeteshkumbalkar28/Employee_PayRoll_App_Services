package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmpDTO;
import com.bridgelabz.employeepayroll.model.EmpData;

public interface EmployeeService {
    EmpData addEmployee(EmpDTO empDTO);
}
