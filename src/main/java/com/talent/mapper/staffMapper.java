package com.talent.mapper;

import com.talent.entity.staff;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface staffMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(staff record);

    int insertSelective(staff record);

    staff selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(staff record);

    int updateByPrimaryKey(staff record);
}