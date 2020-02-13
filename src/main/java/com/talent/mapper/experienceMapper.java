package com.talent.mapper;
import com.talent.entity.experience;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface experienceMapper {
    //评分
    Integer score(Integer eid,Integer esco);

    //查询已发布信息
    List<experience> listpublic(Integer bid);

    //删除已发布信息
    Integer deletePublic(Integer eid);

    //插入发布招聘信息
    Integer editpublic(experience experience);

    //查询指定用户履职经历列表
    List<experience> listExperience(Integer tid);

    //删除制定tid的信息
    Integer delExperience(Integer tid);
}