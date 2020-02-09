package com.talent.Controller;
import com.talent.entity.business;
import com.talent.entity.contract;
import com.talent.entity.usedtalent;
import com.talent.service.businessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;


@Controller
@RequestMapping(value = {"/business"})
public class BusinessController {

    @Autowired
    private businessService businessservice;

    @RequestMapping(value = {"/listBusiness"})
    public String listBusiness(Integer bid, Model model){
        business listbusiness=businessservice.listBusiness(bid);
        model.addAttribute("listbusiness", listbusiness);
        return "oneleader/Company_information";
    }


    @RequestMapping(value = {"/listContract"})
    public String listContract(Integer bid,Model model)
    {
        List<contract> listcontract=businessservice.listContract(bid);
        model.addAttribute("listcontract", listcontract);
        return "oneleader/Contract";
    }

    @RequestMapping(value = {"/listUsedTalent"})
    public String listUsedTalent(Integer bid, Model model)
    {
        List<usedtalent> listusedtalent=businessservice.listUsedTalent(bid);
        model.addAttribute("listusedtalent", listusedtalent);
        return "oneleader/Talent_information";
    }

    @RequestMapping(value = {"/Publish"})
    public String Publish(){
        return "oneleader/Publish";
    }


    @RequestMapping(value = {"/exit"})
    public String exit(){
        return "foregro/login";
    }
}
