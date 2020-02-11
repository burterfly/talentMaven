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

import java.util.List;


@Controller
@RequestMapping(value = {"/talent"})
public class TalentController {
    @Autowired
    private TalentService talentservice;
    @Autowired
    private businessService businessservice;

    @RequestMapping(value = {"/listTalent"})
    public String listTalent(Integer tid, Model model){
        talent listtalent  = talentservice.listTalent(tid);
        model.addAttribute("listtalent", listtalent);
        return "twoleader/Information";
    }


    @RequestMapping(value = {"/listContract"})
    public String listContract(Integer tid, Model model){
        List<contract> listcontract=talentservice.listContract(tid);
        model.addAttribute("listcontract", listcontract);
        return "twoleader/Contract";
    }

    @RequestMapping(value = {"/listExperience"})
    public String listExperience(Integer tid, Model model){
        List<experience> listexperience=talentservice.listExperience(tid);
        for(int i=0;i<listexperience.size();i++)
        {
            Integer bid=listexperience.get(i).getBid();
            String name;
            name=businessservice.listBusiness(bid).getBname();
            listexperience.get(i).setBname(name);
        }
        model.addAttribute("listexperience", listexperience);
        return "twoleader/Experience";
    }

    @RequestMapping(value = {"/listMoney"})
    public String listMoney(Integer tid, Model model) {
        List<money> listmoney = talentservice.listMoney(tid);
        for (int i = 0; i < listmoney.size(); i++) {
            Integer bid = listmoney.get(i).getBid();
            String name;
            name = businessservice.listBusiness(bid).getBname();
            listmoney.get(i).setBname(name);
        }
        model.addAttribute("listmoney", listmoney);
        return "twoleader/Wages";
    }
    //  @RequestMapping(value = {"/exit"})

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


