package com.talent.mapper;
import com.talent.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component
public interface businessMapper {

    business listBusiness(Integer bid);

    List<usedtalent> listUsedTalent(Integer bid);

    List<business> listAllBusiness();

    business businesslogin(String username,String password);

    Integer businessregister(business business);

    Integer delbusiness(Integer bid);

    Integer businessUpdate(business business);
}