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

    //查询指定公司派遣人才
    List<usedtalent> listUsedTalent(Integer bid);

    List<business> listAllBusiness();

    business businesslogin(String username,String password);

    Integer businessregister(business business);
}