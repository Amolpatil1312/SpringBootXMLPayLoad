package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public ResponseEntity<String> save(@RequestBody Employee employee){
        employeeService.save(employee);
        return ResponseEntity.ok("The Employee Data Saved successfully....");
    }

    @GetMapping("/")
    public ResponseEntity<List<Employee>> findAll(){
        return ResponseEntity.ok(employeeService.findAll());
    }

}
