package com.talent.service;

import com.talent.entity.*;
import com.talent.mapper.businessMapper;
import com.talent.mapper.talentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class businessService {

    @Autowired
    private businessMapper businessmapper;

    //查询指定公司列表
    public business listBusiness(Integer bid)
    {
        //     System.out.println("Service层===========>ok");
        return businessmapper.listBusiness(bid);
    }

    //查询指定公司合同
    public List<contract> listContract(Integer bid)
    {
        return businessmapper.listContract(bid);
    }

    //查询指定公司雇佣人才
    public List<usedtalent> listUsedTalent(Integer bid)
    {
        return businessmapper.listUsedTalent(bid);
    }

    //插入评分
    public Integer score(Integer eid,Integer esco)
    {
        return businessmapper.score(eid,esco);
    }

    //查询已发布信息
    public List<experience> listpublic(Integer bid)
    {
        return businessmapper.listpublic(bid);
    }

    //删除已发布信息
    public Integer deletePublic(Integer eid)
    {
        return businessmapper.deletePublic(eid);
    }

    //插入发布招聘信息
    public Integer editpublic(experience experience){
        System.out.println("sercice层："+experience.getEjob());
        return businessmapper.editpublic(experience); }
}
