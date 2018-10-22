package com.service;

import com.pojo.Type;

import java.util.List;

public interface TypeService {
    public List<Type> queryByType(String type);
}
