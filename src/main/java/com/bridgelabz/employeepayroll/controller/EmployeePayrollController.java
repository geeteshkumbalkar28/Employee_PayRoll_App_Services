package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.dto.EmpDTO;
import com.bridgelabz.employeepayroll.dto.ResponseDTO;
import com.bridgelabz.employeepayroll.model.EmpData;
import com.bridgelabz.employeepayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeePayrollController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/Save")
    public ResponseDTO addEmployee(@RequestBody EmpDTO empDTO){
        EmpData empData = employeeService.addEmployee(empDTO);
        ResponseDTO responseDTO = new ResponseDTO("Data Added Succesfully",empData);
        return responseDTO;
    }

}
