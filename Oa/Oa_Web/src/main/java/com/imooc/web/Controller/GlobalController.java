package com.imooc.web.Controller;

import com.imooc.oa.Entity.Employee;
import com.imooc.oa.biz.GlobalBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller("globalController")
public class GlobalController {
    @Autowired
    private GlobalBiz globalBiz;
    @RequestMapping("/to_login")
    public String tologin(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(@RequestParam String sn, @RequestParam String password, HttpServletRequest request){
        Employee employee = globalBiz.login(sn, password);
        if (employee==null){
            return "redirect:to_login";
        }
        HttpSession session = request.getSession();
        session.setAttribute("employee",employee);
        return "redirect:self";
    }
    @RequestMapping("/self")
    public String self(){
        return "self";
    }
    @RequestMapping("/quiet")
    public String qui( HttpServletRequest request){
       HttpSession session = request.getSession();
        session.setAttribute("employee",null);
        return "redirect:to_login";
    }
    @RequestMapping("/to_change_password")
    public String tochangepassword(){
        return "change_password";
    }
    @RequestMapping("/change_password")
    public String changepassword(@RequestParam String old, @RequestParam String new1, @RequestParam String new2 , HttpServletRequest request, HttpServletResponse response){
        Employee employee = (Employee) request.getSession().getAttribute("employee");
        if (employee.getPassword().equals(old)&&new1.equals(new2)){
            employee.setPassword(new1);
            globalBiz.changepassword(employee);
            try {
                response.getWriter().write("密码修改成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "redirect:self";
        }
        return "redirect:to_change_password";
    }
}
