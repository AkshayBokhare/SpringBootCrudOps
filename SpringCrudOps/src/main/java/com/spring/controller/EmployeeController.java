package com.spring.controller;

import com.spring.entity.Employee;
import com.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        Employee emp = employeeService.saveEmployee(employee);
        return ResponseEntity.ok().body(emp);
    }

    @GetMapping("/getEmployeeById/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        Employee emp = employeeService.getEmployeeById(id);
        return emp;
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = employeeService.getAllEmployee();
        return employeeList;
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable int id) {
        employeeService.deleteById(id);
    }

    @GetMapping("/getEmployeeByName/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name){
        return  employeeService.getEmployeeByName(name);
    }
}
