package com.talent.mapper;

import com.talent.entity.contract;
import com.talent.entity.staff;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface staffMapper {
    //查询合同列表
    List<contract> listContract();
}