package com.talent.mapper;

import com.talent.entity.contract;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface contractMapper {
    int deleteByPrimaryKey(Integer cid);
    int insert(contract record);
    int insertSelective(contract record);
    contract selectByPrimaryKey(Integer cid);
    int updateByPrimaryKeySelective(contract record);
    int updateByPrimaryKey(contract record);
}