package com.talent.Controller;

import com.talent.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = {"/user"})
public class TalentController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = {"/about"})
    public String Now(){
        return "foregro/about";
    }

}


