package com.talent.mapper;
import com.talent.entity.tcontract;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface tcontractMapper {
    //查询指定用户合同列表
    List<tcontract> listTContract(Integer tid);

    //删除指定用户的合同
    Integer delTContract(Integer tid);
}