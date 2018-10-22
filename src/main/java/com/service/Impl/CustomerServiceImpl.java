package com.service.Impl;

import com.dao.CustomerDao;
import com.pojo.Customer;
import com.pojo.QueryCustomer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    //查询所有用户
    @Override
    public List<Customer> queryAll() {
        return customerDao.queryAll();
    }

    @Override
    public int count(QueryCustomer qc) {
        return customerDao.count(qc);
    }

    @Override
    public List<Customer> query(QueryCustomer qc) {
        int size = qc.getRows();
        int page = qc.getPage();
        int count = count(qc);//获取总条数
        count = count % size == 0 ? (count / size) : (count / size + 1);//总页数
        if (count == 0) {
            return null;
        }
        //容错处理
        page = page < 1 ? 1 : page;
        page = page > count ? count : page;

        qc.setPage(page);
        qc.setPianyi(size * (page - 1));
        qc.setPagecount(count);
        qc.setShang((page - 1) < 1 ? 1 : (page - 1));
        qc.setXia((page + 1) > count ? count : (page + 1));

        return customerDao.query(qc);
    }

    @Override
    public Customer queryById(int uid) {
        return customerDao.queryById(uid);
    }

    @Override
    public int update(Customer c) {
        return customerDao.update(c);
    }

    @Override
    public int delete(int uid) {
        return customerDao.delete(uid);
    }
}
