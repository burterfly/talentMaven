package com.talent.mapper;

import com.talent.entity.business;
import com.talent.entity.contract;
import com.talent.entity.talent;
import com.talent.entity.usedtalent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface businessMapper {
    //查询指定公司列表
    business listBusiness(Integer bid);

    //查询指定公司合同
    List<contract> listContract(Integer bid);

    //查询指定公司派遣人才
    List<usedtalent> listUsedTalent(Integer bid);

}