package com.talent.mapper;

import com.talent.entity.money;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface moneyMapper {
    int deleteByPrimaryKey(Integer mid);
    int insert(money record);
    int insertSelective(money record);
    money selectByPrimaryKey(Integer mid);
    int updateByPrimaryKeySelective(money record);
    int updateByPrimaryKey(money record);
}