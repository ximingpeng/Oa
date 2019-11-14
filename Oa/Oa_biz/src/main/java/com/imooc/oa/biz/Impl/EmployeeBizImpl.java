package com.imooc.oa.biz.Impl;

import com.imooc.oa.Entity.Employee;
import com.imooc.oa.biz.EmployeeBiz;
import com.imooc.oa.dao.Employeedao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("employeeBiz")
public class EmployeeBizImpl implements EmployeeBiz {
    @Autowired
    private Employeedao employeedao;
    public void add(Employee employee) {
        employee.setPassword("000000");
        employeedao.insert(employee);
    }

    public void edit(Employee employee) {
        employeedao.update(employee);
    }

    public void remove(String sn) {
        employeedao.delete(sn);
    }

    public Employee get(String sn) {
        Employee select = employeedao.select(sn);
        return select;
    }

    public List<Employee> getAll() {
        List<Employee> employees = employeedao.selectAll();
        return employees;
    }
}
