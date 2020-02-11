package com.talent.Controller;
import com.talent.entity.*;
import com.talent.service.businessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping(value = {"/business"})
public class BusinessController {

    @Autowired
    private businessService businessservice;
//----------------------------展示企业信息------------------
//    @RequestMapping(value = {"/listBusiness"})
//    public String listBusiness(Integer bid, Model model){
//        business listbusiness=businessservice.listBusiness(bid);
//        model.addAttribute("listbusiness", listbusiness);
//        return "oneleader/Company";
     //   return "oneleader/Company_information";
//    }

    @RequestMapping(value = {"/listBusiness"}, method = RequestMethod.GET)
    public String listBusiness(Integer bid,Model model){
        System.out.println(bid);
        business listbusiness=businessservice.listBusiness(bid);
        model.addAttribute("listbusiness", listbusiness);
        System.out.println("显示企业信息"+listbusiness.getBname());
        return "oneleader/Company";
    }

//------------合同----------------------------------
//    @RequestMapping(value = {"/listContract"})
//    public String listContract(Integer bid,Model model)
//    {
//        List<contract> listcontract=businessservice.listContract(bid);
//        model.addAttribute("listcontract", listcontract);
//        return "oneleader/Contract";
//    }

    @RequestMapping(value = {"/listContract"}, method = RequestMethod.GET)
    @ResponseBody
    public List<contract> listContract(Integer bid){
        List<contract> listcontract=businessservice.listContract(bid);
        System.out.println("显示所有合同"+listcontract.size());
        return listcontract;
    }

    //-------------------------聘用记录--------------------

 //   @RequestMapping(value = {"/listUsedTalent"})
//    public String listUsedTalent(Integer bid, Model model)
//    {
//        List<usedtalent> listusedtalent=businessservice.listUsedTalent(bid);
//        model.addAttribute("listusedtalent", listusedtalent);
//        return "oneleader/Talent_information";
//   }

    @RequestMapping(value = {"/listUsedTalent"}, method = RequestMethod.GET)
    @ResponseBody
    public List<usedtalent> listUsedTalent(Integer bid){

        List<usedtalent> listusedtalent=businessservice.listUsedTalent(bid);
        System.out.println("显示所有聘用记录"+listusedtalent.size());
        return listusedtalent;
    }
//------------------展示招聘------------------------------

 //  @RequestMapping(value = {"/Publish"})
 //  public String Publish(Integer bid,Model model)
 //   {
 //       System.out.println(bid);
 //       List<experience> listpublic=businessservice.listpublic(bid);
 //       for (int i = 0; i < listpublic.size(); i++) {
 //           String name;
 //           name = businessservice.listBusiness(bid).getBname();
 //           listpublic.get(i).setBname(name);
//        }
//        model.addAttribute("listpublic", listpublic);
 //       return "oneleader/Publish";
 //   }

    @RequestMapping(value = {"/Publish"}, method = RequestMethod.GET)
    @ResponseBody
    public List<experience> Publish(Integer bid){
        System.out.println("展示招聘信息"+bid);
        List<experience> listpublic=businessservice.listpublic(bid);
               for (int i = 0; i < listpublic.size(); i++) {
                   String name;
                   name = businessservice.listBusiness(bid).getBname();
                   listpublic.get(i).setBname(name);
        }
        return listpublic;
    }
//----------------------------增加招聘信息--------------------------------
    @RequestMapping(value = {"/editPublish"}, method = RequestMethod.POST)
    public String editPublish(Integer bid,String etime,String ejob,Model model)
    {
        System.out.println(bid);
        System.out.println(etime);
        System.out.println(ejob);
        List<experience> listpublic=businessservice.listpublic(bid);
        model.addAttribute("listpublic", listpublic);
        return "oneleader/Publish";
    }
//-------------------------评分----------------------------------
    @RequestMapping(value = {"/score"}, method = RequestMethod.POST)
    public String score(Integer bid,Integer eid,Integer esco,Model model){
        System.out.println(bid);
        System.out.println(eid);
        System.out.println(esco);
        businessservice.score(eid,esco);
        List<usedtalent> listusedtalent=businessservice.listUsedTalent(bid);
        model.addAttribute("listusedtalent", listusedtalent);
        return "oneleader/Talent_information";
    }
//-----------------------删除招聘信息-----------------------------
    @RequestMapping(value = {"/deletePublish"}, method = RequestMethod.POST)
    public String deletePublish(Integer bid,Integer eid,Model model)
    {
        System.out.println("测试一下");
        System.out.println(bid);
        System.out.println(eid);
        businessservice.deletePublic(eid);
        List<experience> listpublic=businessservice.listpublic(bid);
        model.addAttribute("listpublic", listpublic);
        return "oneleader/Publish";
    }

    @RequestMapping(value = {"/exit"})
    public String exit(){
        return "foregro/login";
    }
}
