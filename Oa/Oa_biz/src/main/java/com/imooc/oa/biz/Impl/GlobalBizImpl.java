package com.imooc.oa.biz.Impl;

import com.imooc.oa.Entity.Employee;
import com.imooc.oa.biz.GlobalBiz;
import com.imooc.oa.dao.Employeedao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("globalBiz")
public class GlobalBizImpl implements GlobalBiz {
    @Autowired
    private Employeedao employeedao;
    public Employee login(String sn, String password) {
        Employee select = employeedao.select(sn);
        if (select!=null&&select.getPassword().equals(password)){
            return select;
        }
        return null;
    }

    public void changepassword(Employee employee) {
        employeedao.update(employee);
    }
}
