package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmpDTO;
import com.bridgelabz.employeepayroll.model.EmpData;
import com.bridgelabz.employeepayroll.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayRollServiceImp implements EmployeeService{
    List<EmpData> list = new ArrayList<>();
    @Autowired
    private EmpRepo empRepo;
    @Override
    public EmpData addEmployee(EmpDTO empDTO) {
        EmpData empData = new EmpData(empDTO);
        list.add(empData);
        return empRepo.save(empData);
    }

    @Override
    public Optional<EmpData> getEmployeeById(int id) {
        return empRepo.findById(id);
    }

    @Override
    public List<EmpData> getDisplayAllEmployee() {
        return empRepo.findAll();
    }
}
