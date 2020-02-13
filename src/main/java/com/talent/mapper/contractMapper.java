package com.talent.mapper;
import com.talent.entity.contract;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface contractMapper {
    //查询指定公司合同
    List<contract> listContract(Integer bid);
}