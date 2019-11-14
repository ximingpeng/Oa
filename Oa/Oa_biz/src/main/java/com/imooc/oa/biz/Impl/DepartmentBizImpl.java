package com.imooc.oa.biz.Impl;

import com.imooc.oa.Entity.Department;
import com.imooc.oa.biz.DepartmentBiz;
import com.imooc.oa.dao.Departmentdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("departmentBiz")
public class DepartmentBizImpl implements DepartmentBiz {
    @Autowired
    @Qualifier("departementDao")
    private Departmentdao dao;
    public void add(Department department) {
        dao.insert(department);
    }

    public void edit(Department department) {
        dao.update(department);
    }

    public void remove(String sn) {
            dao.delete(sn);
    }

    public Department get(String sn) {
        return dao.select(sn);
    }

    public List<Department> getAll() {
        return dao.selectAll();
    }
}
