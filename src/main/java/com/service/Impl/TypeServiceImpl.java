package com.service.Impl;

import com.dao.TypeDao;
import com.pojo.Type;
import com.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeDao typeDao;
    @Override
    public List<Type> queryByType(String type) {
        return typeDao.queryByType(type);
    }
}
