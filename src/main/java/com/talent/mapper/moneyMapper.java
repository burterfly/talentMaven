package com.talent.mapper;
import com.talent.entity.money;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface moneyMapper {
    //查询指定用户工资列表
    List<money> listMoney(Integer tid);

    Integer delMoney(Integer tid);

    Integer addWages(money money);
}