package com.example.demo.controller;
        import java.util.List;

        import com.example.demo.model.CustomEmployee;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;
        import com.example.demo.model.Employee;
        import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeRestfulController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path="/employees", method=RequestMethod.GET)
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping(path="employees/it", method = RequestMethod.GET)
    public List<CustomEmployee> gettest() {return employeeService.gettest();}

}
