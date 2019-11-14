package com.imooc.oa.Entity;

import java.io.Serializable;

public class Employee implements Serializable {
    private String sn;
    private String password;
    private String name;
    private  String department_sn;
    private String post;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment_sn() {
        return department_sn;
    }

    public void setDepartment_sn(String department_sn) {
        this.department_sn = department_sn;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "sn='" + sn + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", department_sn='" + department_sn + '\'' +
                ", post='" + post + '\'' +
                ", department=" + department +
                '}';
    }
}
