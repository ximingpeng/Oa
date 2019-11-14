package com.imooc.oa.dao;

import com.imooc.oa.Entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("departementDao")
public interface Departmentdao {
    void insert(Department department);
    void  update(Department department);
    void  delete(String sn);
    Department select(String sn);
    List<Department> selectAll();
}
