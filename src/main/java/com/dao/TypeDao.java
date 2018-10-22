package com.dao;

import com.pojo.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeDao {

    public List<Type> queryByType(String type);

}
