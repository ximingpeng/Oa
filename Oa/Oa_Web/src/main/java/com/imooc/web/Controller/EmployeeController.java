package com.imooc.web.Controller;

import com.imooc.oa.Entity.Department;
import com.imooc.oa.Entity.Employee;
import com.imooc.oa.Global.Constant;
import com.imooc.oa.biz.DepartmentBiz;
import com.imooc.oa.biz.EmployeeBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.transform.Source;
import java.util.List;
import java.util.Map;

@Controller("employeeController")
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeBiz employeeBiz;
    @Autowired
    private DepartmentBiz departmentBiz;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",employeeBiz.getAll());
        return "employee_list";
    }
    @RequestMapping("/to_add")
    public String toadd(Map<String,Object> map){
        Employee employee = new Employee();
        map.put("employee", employee);
        map.put("dlist",departmentBiz.getAll());
        List<String> post = Constant.getPost();
        System.out.println(post);
        map.put("plist", post);
        return "employee_add";
    }
    @RequestMapping("/add")
    public String add(Employee employee){
        employeeBiz.add(employee);
        return "redirect:list";
    }
    @RequestMapping(value = "/to_update",params ="sn")
    public String update(String sn,Map<String,Object> map){
        map.put("employee",employeeBiz.get(sn));
        map.put("dlist",departmentBiz.getAll());
        map.put("plist",Constant.getPost());
        return "employee_update";
    }
    @RequestMapping("/update")
    public String update(Employee employee){
        employeeBiz.edit(employee);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params ="sn")
    public String remove(String sn){
        employeeBiz.remove(sn);
        return "redirect:list";
    }
}
