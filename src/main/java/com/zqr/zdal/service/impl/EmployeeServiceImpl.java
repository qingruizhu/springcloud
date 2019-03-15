package com.zqr.zdal.service.impl;

import com.zqr.zdal.dao.EmployeeMapper;
import com.zqr.zdal.service.IEmployeeService;
import com.zqr.zdal.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> queryAllEmployeeList() {
        List<Employee> employees = employeeMapper.queryAllEmployeeList();
        return employees;
    }

    @Override
    public int add(Employee employee) {
       int count = employeeMapper.addEmployee(employee);
        return count;
    }

    @Override
    public int deleteEmpById(int id){
        return employeeMapper.deleteEmpById(id);
    }

    @Transactional
    @Override
    public  int updateEmpl(Employee employee){
        employeeMapper.updateEmpl(employee);
        Employee employee1 = employee;
        //int a =1/0;
        employee1.setId(employee.getId()-1);
        employeeMapper.updateEmpl(employee1);
        return 0;
    }

}
