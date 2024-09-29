package com.spring.service;

import com.spring.entity.Employee;
import com.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;
    public Employee saveEmployee(Employee employee){
           return repository.save(employee);
    }

    public Employee getEmployeeById(int id){
         return repository.findByEmpId(id);
    }


    public List<Employee> getAllEmployee(){
         List<Employee> employeeList = (List<Employee>) repository.findAll();
        return employeeList;
    }

    public void deleteById(int id){
         repository.deleteById(id);
    }

    public List<Employee> getEmployeeByName(String name){
        return repository.getEmployeeByName(name);
    }

}
