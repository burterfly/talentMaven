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

    @RequestMapping(value = {"/User"})
    public String User(){
//        return "leader/User";
//        return "leader/Uwage";
       // return "leader/Uexp";
        return "leader/Ucontract";
//        return "leader/Company";
//        return "leader/Ccontract";
    }
}
