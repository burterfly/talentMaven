package com.talent.Controller;
import com.talent.entity.*;
import com.talent.service.TalentService;
import com.talent.service.businessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
@RequestMapping(value = {"/talent"})
public class TalentController {
    @Autowired
    private TalentService talentservice;
    @Autowired
    private businessService businessservice;
//---------------------------------------------------------------------------------------------------
    @RequestMapping(value = {"/listTalent"})
    public String listTalent(Integer tid, Model model){
        talent listtalent  = talentservice.listTalent(tid);
        model.addAttribute("listtalent", listtalent);
        return "twoleader/Talent";
    }

    //---------------------------------------------------------------------------------------------------

    @RequestMapping(value = {"/listContract"}, method = RequestMethod.GET)
    @ResponseBody
    public List<tcontract> listContract(Integer tid, HttpSession session){
        tid= (Integer) session.getAttribute("tid");
        List<tcontract> listtcontract=talentservice.listTContract(tid);
        System.out.println("显示所有合同"+listtcontract.size());
        return listtcontract;
    }

    //---------------------------------------------------------------------------------------------------
    @RequestMapping(value = {"/listExperience"}, method = RequestMethod.GET)
    @ResponseBody
    public  List<experience> listExperience(Integer tid, HttpSession session){
        tid= (Integer) session.getAttribute("tid");
        List<experience> listexperience=talentservice.listExperience(tid);
        for(int i=0;i<listexperience.size();i++)
        {
            Integer bid=listexperience.get(i).getBid();
            String name;
            name=businessservice.listBusiness(bid).getBname();
            listexperience.get(i).setBname(name);
        }
        return listexperience;
    }
    //---------------------------------------------------------------------------------------------------
    @RequestMapping(value = {"/listMoney"}, method = RequestMethod.GET)
    @ResponseBody
    public  List<money> listMoney(Integer tid, HttpSession session){
        tid= (Integer) session.getAttribute("tid");
        List<money> listmoney = talentservice.listMoney(tid);
        for (int i = 0; i < listmoney.size(); i++) {
            Integer bid = listmoney.get(i).getBid();
            String name;
            name = businessservice.listBusiness(bid).getBname();
            listmoney.get(i).setBname(name);
        }
        return listmoney;
    }
    //---------------------------------------------------------------------------------------------------

    @RequestMapping(value = {"/now"})
    public String now(){
        return "twoleader/Now";

    }

    @RequestMapping(value ="/exit", method = RequestMethod.GET)
    public String exit(){
        System.out.println("测试一下实现跳转");
        return "foregro/login";
    }

}


