package com.talent.mapper;

import com.talent.entity.experience;
import com.talent.entity.money;
import com.talent.entity.talent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface talentMapper {
    //查询指定用户列表
    List<talent> listTalent(Integer tid);

    //查询指定用户履职经历列表
    List<experience> listExperience(Integer tid);

    //查询指定用户工资列表
    List<money> listMoney(Integer tid);
}