package com.talent.service;


import com.talent.entity.*;
import com.talent.mapper.talentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TalentService {

    @Autowired
    private talentMapper talentmapper;

    //查询所有公司列表
    public List<business> listAllBusiness()
    {
        return talentmapper.listAllBusiness();
    }

    //查询所有人才列表
    public List<talent> listAllTalent()
    {
        return talentmapper.listAllTalent();
    }

    //查询指定人才列表
    public talent listTalent(Integer tid)
    {
        return talentmapper.listTalent(tid);
    }

    //查询指定人才履职经历
    public List<experience> listExperience(Integer tid)
    {
        return talentmapper.listExperience(tid);
    }

    //查询指定人才工资
    public List<money> listMoney(Integer tid)
    {
        return talentmapper.listMoney(tid);
    }

    //查询指定人才合同
    public List<contract> listContract(Integer tid)
    {
        return talentmapper.listContract(tid);
    }

}
