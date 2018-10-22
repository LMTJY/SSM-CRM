package com.dao;

import com.pojo.Customer;
import com.pojo.QueryCustomer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao {
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
