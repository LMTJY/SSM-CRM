package com.dao;

import com.pojo.Type;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TypeDaoTest {
    @Autowired
    private TypeDao typeDao;
    @Test
    public void queryByType() {
        List<Type> list = typeDao.queryByType("所属行业");
        for (Type type : list) {
            System.out.println(type);
        }
    }
}