package com.zqr.zdal.service;

import com.zqr.zdal.vo.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> queryAllEmployeeList();
    int add(Employee employee);
    int deleteEmpById(int id);
    int updateEmpl(Employee employee);
}
