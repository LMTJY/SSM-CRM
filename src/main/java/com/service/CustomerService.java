package com.service;

import com.pojo.Customer;
import com.pojo.QueryCustomer;

import java.util.List;

public interface CustomerService {
    //查询所有用户
    public List<Customer> queryAll();

    //查询用户数量
    public int count(QueryCustomer qc);

    //根据条件查询
    public List<Customer> query(QueryCustomer qc);

    //根据id查询
    public Customer queryById(int uid);

    //修改数据
    public int update(Customer c);

    //删除数据
    public int delete(int uid);
}
