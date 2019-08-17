package com.example.demo.repository;

import com.example.demo.model.CustomEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Employee;

import java.util.List;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("select distinct new com.example.demo.model.CustomEmployee(e.fname, e.lname, e.salary) from Employee e join Department d on e.dno = d.dnumber where d.dname = :dname")
    List<CustomEmployee> getEmpinfoByDname(@Param("dname") String dname);

}