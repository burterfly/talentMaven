package com.talent.Controller;

import com.talent.service.StaffService;
import com.talent.service.talentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/staff"})
public class StaffController {

    @Autowired
    private StaffService staffservice;

    @RequestMapping(value = {"/Ucontract"})
    public String Ucontract(){
        return "leader/Ucontract";
    }
    @RequestMapping(value = {"/Ccontract"})
    public String Ccontract(){
        return "leader/Ccontract";
    }
    @RequestMapping(value = {"/Company"})
    public String Company(){
        return "leader/Company";
    }
    @RequestMapping(value = {"/Uexp"})
    public String Uexp(){
        return "leader/Uexp";
    }
    @RequestMapping(value = {"/Uwage"})
    public String Uwage(){
        return "leader/Uwage";
    }

    @RequestMapping(value = {"/User"})
    public String User(){
        return "leader/User";
    }
}
