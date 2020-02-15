package com.talent.mapper;
import com.talent.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component
public interface talentMapper {
    //查询所有员工
    List<talent> listAllTalent();

    //查询指定用户列表
    talent listTalent(Integer tid);

    //删除talent
    Integer delTalent(Integer tid);

    //人才登入
    talent talentlogin(String username,String password);

    //人才注册
    Integer talentregister(talent talent);
}