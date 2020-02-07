package com.talent.service;

import com.talent.entity.business;
import com.talent.entity.contract;
import com.talent.entity.talent;
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
    public List<business> listBusiness(Integer bid)
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
    public List<talent> listUsedTalent(Integer bid)
    {
        return businessmapper.listUsedTalent(bid);
    }

}
