package com.talent.mapper;

import com.talent.entity.*;
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

    //查询指定公司派遣人才
    Integer score(Integer eid,Integer esco);

    //查询已发布信息
    List<experience> listpublic(Integer bid);

    //删除已发布信息
    Integer deletePublic(Integer eid);

    //插入发布招聘信息
    Integer editpublic(experience experience);
}