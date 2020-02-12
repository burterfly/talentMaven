package com.talent.mapper;

import com.talent.entity.experience;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface experienceMapper {
    int deleteByPrimaryKey(Integer eid);
    int insert(experience record);
    int insertSelective(experience record);
    experience selectByPrimaryKey(Integer eid);
    int updateByPrimaryKeySelective(experience record);
    int updateByPrimaryKey(experience record);
}