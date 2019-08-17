package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentRestfulController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(path="/departments", method=RequestMethod.GET)
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }


}
