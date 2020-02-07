package com.talent.service;


import com.talent.entity.contract;
import com.talent.entity.experience;
import com.talent.entity.money;
import com.talent.entity.talent;
import com.talent.mapper.talentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class talentService {

    @Autowired
    private talentMapper talentmapper;


    //查询指定人才列表
    public List<talent> listTalent(Integer tid)
    {
   //     System.out.println("Service层===========>ok");
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
