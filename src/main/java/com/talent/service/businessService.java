package com.talent.service;

import com.talent.entity.*;
import com.talent.mapper.businessMapper;
import com.talent.mapper.contractMapper;
import com.talent.mapper.experienceMapper;
import com.talent.mapper.talentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class businessService {

    @Autowired
    private businessMapper businessmapper;
    @Autowired
    private contractMapper contractmapper;
    @Autowired
    private talentMapper talentmapper;
    @Autowired
    private experienceMapper experiencemapper;

    //查询指定公司列表
    public business listBusiness(Integer bid) { return businessmapper.listBusiness(bid); }

    //查询指定公司合同
    public List<contract> listContract(Integer bid) { return contractmapper.listContract(bid); }

    //查询指定公司雇佣人才
    public List<usedtalent> listUsedTalent(Integer bid)
    {
        return businessmapper.listUsedTalent(bid);
    }

    //插入评分
    public Integer score(Integer eid,Integer esco)
    {
        return experiencemapper.score(eid,esco);
    }

    //查询已发布信息
    public List<experience> listpublic(Integer bid)
    {
        return experiencemapper.listpublic(bid);
    }

    //删除已发布信息
    public Integer deletePublic(Integer eid)
    {
        return experiencemapper.deletePublic(eid);
    }

    //插入发布招聘信息
    public Integer editpublic(experience experience) { return experiencemapper.editpublic(experience);}

    //公司登入
    public business businesslogin (String username, String password){ return businessmapper.businesslogin(username, password); }

    //人才注册
    public Integer businessregister(business business) { return businessmapper.businessregister(business); }
    public List<business> listAllBusiness() { return businessmapper.listAllBusiness(); }
    }
