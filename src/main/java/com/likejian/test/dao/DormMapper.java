package com.likejian.test.dao;

import com.likejian.test.entity.Dorm;

public interface DormMapper {
    int deleteByPrimaryKey(Integer dormId);

    int insert(Dorm record);

    int insertSelective(Dorm record);

    Dorm selectByPrimaryKey(Integer dormId);

    int updateByPrimaryKeySelective(Dorm record);

    int updateByPrimaryKey(Dorm record);
}