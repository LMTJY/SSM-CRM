package com.controller;

import com.pojo.Type;
import com.service.TypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class TypeActionTest {
    @Autowired
    private TypeService typeService;
    @Test
    public void listAll() {
        List<Type> positions = typeService.queryByType("所属行业");
        List<Type> levels = typeService.queryByType("客户级别");
        System.out.println(positions);
        System.out.println(levels);
    }
}