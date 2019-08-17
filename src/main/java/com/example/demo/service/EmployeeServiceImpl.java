package com.example.demo.service;
import java.util.List;

import com.example.demo.model.CustomEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public List <CustomEmployee>   gettest() {return employeeRepository.getEmpinfoByDname("IT");}
}
