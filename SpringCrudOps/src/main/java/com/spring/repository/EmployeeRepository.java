package com.spring.repository;

import com.spring.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    //Find by id or FindByXXX
    public Employee findByEmpId(Integer id);

    //Native Query
    @Query(value = "select * from employee where emp_name=?",nativeQuery = true)
    public List<Employee> getEmployeeByName(String name);
}
