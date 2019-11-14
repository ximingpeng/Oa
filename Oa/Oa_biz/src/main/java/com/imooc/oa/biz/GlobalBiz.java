package com.imooc.oa.biz;

import com.imooc.oa.Entity.Employee;

public interface GlobalBiz {
    Employee login(String username,String password);
    void  changepassword(Employee employee);
}
