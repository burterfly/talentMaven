package com.talent.service;


import com.talent.entity.*;
import com.talent.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TalentService {

    @Autowired
    private talentMapper talentmapper;
    @Autowired
    private businessMapper businessmapper;
    @Autowired
    private moneyMapper moneymapper;
    @Autowired
    private tcontractMapper tcontractmapper;
    @Autowired
    private experienceMapper experiencemapper;

    //查询所有公司列表
    public List<business> listAllBusiness()
    {
        return businessmapper.listAllBusiness();
    }

    //查询所有人才列表
    public List<talent> listAllTalent()
    {
        return talentmapper.listAllTalent();
    }

    //查询指定人才列表
    public talent RequrstTalentByTid(Integer tid)
    {
        return talentmapper.listTalent(tid);
    }

    //查询指定人才履职经历
    public List<experience> listExperience(Integer tid)
    {
        return experiencemapper.listExperience(tid);
    }

    //查询指定人才工资
    public List<money> listMoney(Integer tid)
    {
        return moneymapper.listMoney(tid);
    }

    //查询指定人才合同
    public List<tcontract> listTContract(Integer tid)
    {
        return tcontractmapper.listTContract(tid);
    }

    public Integer delTalent(Integer tid) {
        tcontractmapper.delTContract(tid);
        experiencemapper.delExperience(tid);
        moneymapper.delMoney(tid);
        return talentmapper.delTalent(tid);
    }

    //人才登入
    public talent talentlogin (String username, String password){ return talentmapper.talentlogin(username, password); }

    //人才注册
    public Integer talentregister(talent talent) { return talentmapper.talentregister(talent); }

    //人才注册
    public Integer talentUpdate(talent talent) { return talentmapper.talentUpdate(talent); }

    public talent TalentByTusername(String eusername)
    {
        return talentmapper.TalentByTusername(eusername);
    }

}
