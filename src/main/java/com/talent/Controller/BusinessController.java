package com.talent.Controller;

import com.talent.entity.business;
import com.talent.entity.contract;
import com.talent.entity.talent;
import com.talent.service.businessService;
import com.talent.service.talentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping(value = {"/business"})
public class BusinessController {

    @Autowired
    private businessService businessservice;

    @RequestMapping(value = {"/listBusiness"})
    public String listBusiness(Integer bid, HttpSession session){
        List<business> listbusiness=businessservice.listBusiness(bid);
        session.setAttribute("listbusiness", listbusiness);

 //              for(int i=0;i<listbusiness.size();i++)//                                   {
 //              {
 //                  String a=listbusiness.get(i).getBname();
 //                       System.out.println(a);
 //                                          }
        return "oneleader/Company_information";
    }


    @RequestMapping(value = {"/listContract"})
    public String listContract(Integer bid, HttpSession session)
    {
        List<contract> listcontract=businessservice.listContract(bid);
        session.setAttribute("listcontract", listcontract);

  //      for(int i=0;i<listcontract.size();i++)//                                   {
  //                        {
  //                             String a=listcontract.get(i).getCname();
  //                             System.out.println(a);
  //                          }
        return "oneleader/Contract";
    }

    @RequestMapping(value = {"/listUsedTalent"})
    public String listUsedTalent(Integer bid, HttpSession session)
    {
        List<talent> listusedtalent=businessservice.listUsedTalent(bid);
        session.setAttribute("listusedtalent", listusedtalent);

        for(int i=0;i<listusedtalent.size();i++)
           {
             String a=listusedtalent.get(i).getTname();
              System.out.println(a);
                 }

        return "oneleader/Talent_information";
    }

    @RequestMapping(value = {"/exit"})
    public String exit(){
        return "foregro/login";
    }
}
