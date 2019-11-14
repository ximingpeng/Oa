package com.imooc.oa.dao;

import com.imooc.oa.Entity.Department;
import com.imooc.oa.Entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("employeeDao")
public interface Employeedao {
    void insert(Employee employee);
    void  update(Employee employee);
    void  delete(String sn);
    Employee select(String sn);
    List<Employee> selectAll();
}
