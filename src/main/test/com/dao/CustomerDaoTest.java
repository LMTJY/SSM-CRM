package com.dao;

import com.pojo.Customer;
import com.pojo.QueryCustomer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class CustomerDaoTest {
    @Autowired
    private CustomerDao customerDao;
    @Test
    public void queryAll() {
        List<Customer> customers = customerDao.queryAll();
        System.out.println(customers);
    }

    @Test
    public void count() {
        QueryCustomer qc = new QueryCustomer();
        int count = customerDao.count(qc);
        System.out.println(count);
    }
}