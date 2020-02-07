package com.talent.Controller;
import com.talent.entity.contract;
import com.talent.entity.experience;
import com.talent.entity.money;
import com.talent.entity.talent;
import com.talent.service.talentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = {"/talent"})
public class TalentController {
    @Autowired
    private talentService talentservice;


    @RequestMapping(value = {"/listTalent"})
    public String listTalent(Integer tid, HttpSession session){
    //    System.out.println("controller层======》查询人才信息:"+tid);
        List<talent> listtalent=talentservice.listTalent(tid);
        session.setAttribute("listtalent", listtalent);
 //       for(int i=0;i<listtalent.size();i++)
 //       {
 //           String a=listtalent.get(i).getTname();
 //           System.out.println(a);
 //       }
        return "twoleader/Information";
    }


    @RequestMapping(value = {"/listExperience"})
    public String listExperience(Integer tid, HttpSession session){
        List<experience> listexperience=talentservice.listExperience(tid);
        session.setAttribute("listexperience", listexperience);
  //      for(int i=0;i<listexperience.size();i++)
  //                 {
  //                     String a=listexperience.get(i).getEjob();
  //                     System.out.println(a);
  //                 }
        return "twoleader/Experience";
    }

    @RequestMapping(value = {"/listMoney"})
    public String listMoney(Integer tid, HttpSession session){
        List<money> listmoney=talentservice.listMoney(tid);
        session.setAttribute("listmoney", listmoney);
 //             for(int i=0;i<listmoney.size();i++)
 //                        {
 //                            String a=listmoney.get(i).getMmoney();
 //                            System.out.println(a);
 //                        }
        return "twoleader/Wages";
    }


    @RequestMapping(value = {"/listContract"})
    public String listContract(Integer tid, HttpSession session){
        List<contract> listcontract=talentservice.listContract(tid);
        session.setAttribute("listcontract", listcontract);

 //       for(int i=0;i<listcontract.size();i++)//                                   {
 //                                        String a=listcontract.get(i).getCname();
 //                                        System.out.println(a);
 //                                   }

        return "twoleader/Contract";
    }

    @RequestMapping(value = {"/now"})
    public String now(){
        return "twoleader/Now";
    }

    @RequestMapping(value = {"/exit"})
    public String exit(){
        return "foregro/login";
    }

}


