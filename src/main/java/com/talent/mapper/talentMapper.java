package com.talent.mapper;

import com.talent.entity.talent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface talentMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(talent record);

    int insertSelective(talent record);

    talent selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(talent record);

    int updateByPrimaryKey(talent record);
}