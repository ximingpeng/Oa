package com.imooc.oa.dao;


import com.imooc.oa.Entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:Spring-dao.xml")
public class test {
    @Autowired
    @Qualifier("template")
    private JdbcTemplate template;
    @Test
    public void select(){
        final List<Employee> query = template.query("select * from employee", new BeanPropertyRowMapper<Employee>(Employee.class));
        System.out.println(query);
    }
}
