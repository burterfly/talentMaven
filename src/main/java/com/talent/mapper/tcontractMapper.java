package com.talent.mapper;

import com.talent.entity.tcontract;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tcontractMapper {
    int insert(tcontract record);
    int insertSelective(tcontract record);

}