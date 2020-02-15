package com.talent.Controller;
import com.talent.entity.*;
import com.talent.service.businessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping(value = {"/business"})
public class BusinessController {

    @Autowired
    private businessService businessservice;
//----------------------------展示企业信息------------------
    @RequestMapping(value = {"/listBusiness"}, method = RequestMethod.GET)
    public String listBusiness(Integer bid,Model model){
        business listbusiness=businessservice.listBusiness(bid);
        model.addAttribute("listbusiness", listbusiness);
        return "oneleader/Company";
    }
//------------合同----------------------------------
    @RequestMapping(value = {"/listContract"}, method = RequestMethod.GET)
    @ResponseBody
    public List<contract> listContract(Integer bid, HttpSession session){


        bid= (Integer) session.getAttribute("bid");
        List<contract> listcontract=businessservice.listContract(bid);

        return listcontract;
    }

    //-------------------------聘用记录--------------------
    @RequestMapping(value = {"/listUsedTalent"}, method = RequestMethod.GET)
    @ResponseBody
    public List<usedtalent> listUsedTalent(Integer bid, HttpSession session){
        bid= (Integer) session.getAttribute("bid");
        List<usedtalent> listusedtalent=businessservice.listUsedTalent(bid);

        return listusedtalent;
    }
//------------------展示招聘------------------------------
    @RequestMapping(value = {"/Publish"}, method = RequestMethod.GET)
    @ResponseBody
    public List<experience> Publish(Integer bid, HttpSession session){
        bid= (Integer) session.getAttribute("bid");
        List<experience> listpublic=businessservice.listpublic(bid);
               for (int i = 0; i < listpublic.size(); i++) {
                   String name;
                   name = businessservice.listBusiness(bid).getBname();
                   listpublic.get(i).setBname(name);
        }
        return listpublic;
    }
//----------------------------增加招聘信息--------------------------------
    @RequestMapping(value = {"/editpublish"}, method = RequestMethod.GET)
    @ResponseBody
    public List<experience> editpublish(Integer bid,String etime,String ejob, HttpSession session){
        bid= (Integer) session.getAttribute("bid");
        experience experience=new experience();
        experience.setBid(bid);
        experience.setEjob(ejob);
        experience.setEtime(etime);
        businessservice.editpublic(experience);
        List<experience> listpublic=businessservice.listpublic(bid);
        for (int i = 0; i < listpublic.size(); i++) {
            String name;
            name = businessservice.listBusiness(bid).getBname();
            listpublic.get(i).setBname(name);
        }
        return listpublic;
    }
//-------------------------评分----------------------------------
    @RequestMapping(value = {"/score"}, method = RequestMethod.GET)
    @ResponseBody
    public List<usedtalent> score(Integer bid,Integer eid,Integer esco, HttpSession session){
        bid= (Integer) session.getAttribute("bid");
        businessservice.score(eid,esco);
        List<usedtalent> listusedtalent=businessservice.listUsedTalent(bid);
        System.out.println("评分+显示所有聘用记录"+listusedtalent.size());
        return listusedtalent;
    }

//-----------------------删除招聘信息-----------------------------
    @RequestMapping(value = {"/deletePublish"}, method = RequestMethod.GET)
    @ResponseBody
    public List<experience> deletePublish(Integer bid,Integer eid, HttpSession session){
        bid= (Integer) session.getAttribute("bid");
        businessservice.deletePublic(eid);
        List<experience> listpublic=businessservice.listpublic(bid);
        for (int i = 0; i < listpublic.size(); i++) {
            String name;
            name = businessservice.listBusiness(bid).getBname();
            listpublic.get(i).setBname(name);
        }
        System.out.println("删除+显示所有发布信息"+listpublic.size());
        return listpublic;
    }
//----------------------退出----------------------------------------
    @RequestMapping(value = {"/exit"})
    public String exit(){
        return "foregro/login";
    }
}
