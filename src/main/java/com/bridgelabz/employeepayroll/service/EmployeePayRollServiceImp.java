package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmpDTO;
import com.bridgelabz.employeepayroll.model.EmpData;
import com.bridgelabz.employeepayroll.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayRollServiceImp implements EmployeeService{
    @Autowired
    private EmpRepo empRepo;
    @Override
    public EmpData addEmployee(EmpDTO empDTO) {
        EmpData empData = new EmpData(empDTO);
        return empRepo.save(empData);
    }
}
