package com.talent.service;
import com.talent.entity.*;
import com.talent.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StaffService {

    @Autowired
    private staffMapper staffmapper;
    @Autowired
    private businessMapper businessmapper;
    @Autowired
    private contractMapper contractmapper;
    @Autowired
    private experienceMapper experiencemapper;
    @Autowired
    private moneyMapper moneymapper;

    //查询指定人才合同
    public List<contract> listContract()
    {
        return staffmapper.listContract();
    }

    public Integer businessregister(business business) { return businessmapper.businessregister(business); }

    public Integer delbusiness(Integer bid) {
        contractmapper.delContract(bid);
        experiencemapper.delCexperience(bid);
        return businessmapper.delbusiness(bid);
    }

    public Integer businessUpdate(business business) { return businessmapper.businessUpdate(business); }

    public business RequrstBusinessByBid(Integer bid) { return businessmapper.listBusiness(bid); }

    public Integer addWages(money money) { return moneymapper.addWages(money); }

    public Integer experienceUpdate(experience experience) { return experiencemapper.experienceUpdate(experience); }

}
