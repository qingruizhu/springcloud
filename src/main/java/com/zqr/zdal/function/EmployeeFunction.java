package com.zqr.zdal.function;

import com.zqr.zdal.service.IEmployeeService;
import com.zqr.zdal.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/employee")
public class EmployeeFunction {

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("/queryAll")
    public List<Employee> queryAllEmployee(){
        List<Employee> employees = employeeService.queryAllEmployeeList();
        return employees;
    }
    @RequestMapping("/add")
    public int addEmployee(){
        Employee employee = new Employee();
        employee.setId(5);
        employee.setName("小五");
        employee.setSex("男");
        return employeeService.add(employee);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int deleteEmpById(@RequestParam(value = "id",required = true) int id){
        return employeeService.deleteEmpById(id);
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public int updateEmpl(@RequestParam(required = false) int id,
                          @RequestParam(required = false) String name,
                          @RequestParam(required = false) String sex,
                          @RequestParam(required = false) String age){
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setSex(sex);
        employee.setAge(age);
        return employeeService.updateEmpl(employee);
    }
}
