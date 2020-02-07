package com.talent.Controller;

import com.talent.service.talentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = {"/talent"})
public class TalentController {

    @Autowired
    private talentService talentservice;

    @RequestMapping(value = {"/information"})
    public String information(){

        return "twoleader/Information";
    }

    @RequestMapping(value = {"/contract"})
    public String contract(){
        return "twoleader/Contract";
    }

    @RequestMapping(value = {"/experience"})
    public String experience(){
        return "twoleader/Experience";
    }

    @RequestMapping(value = {"/wages"})
    public String wages(){
        return "twoleader/Wages";
    }

    @RequestMapping(value = {"/now"})
    public String now(){
        return "twoleader/Now";
    }
}


