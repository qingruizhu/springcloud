package com.zqr.zdal.dao;

import com.zqr.zdal.vo.Employee;

import java.util.List;
public interface EmployeeMapper {
    List<Employee> queryAllEmployeeList();
    int addEmployee(Employee employee);
    int deleteEmpById(int id);
    int updateEmpl(Employee employee);
}
