package com.talent.mapper;

import com.talent.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface talentMapper {
    //查询所有员工
    List<talent> listAllTalent();

    List<business> listAllBusiness();

    //查询指定用户列表
    talent listTalent(Integer tid);

    //查询指定用户履职经历列表
    List<experience> listExperience(Integer tid);

    //查询指定用户工资列表
    List<money> listMoney(Integer tid);

    //查询指定用户合同列表
    List<contract> listContract(Integer tid);
}