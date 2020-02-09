package com.talent.service;

import com.talent.entity.contract;
import com.talent.mapper.staffMapper;
import com.talent.mapper.talentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    private staffMapper staffmapper;

    //查询指定人才合同
    public List<contract> listContract()
    {
        return staffmapper.listContract();
    }
}
