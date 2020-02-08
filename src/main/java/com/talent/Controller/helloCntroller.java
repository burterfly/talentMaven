package com.talent.Controller;

import com.talent.entity.User;
import com.talent.entity.talent;
import com.talent.service.talentService;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = {"/hello"})
public class helloCntroller {
    @Autowired
    private talentService talentservice;



    @RequestMapping(value = {"/index1"})
        public String hello(){
            return "index1";
        }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("msg", "SpringBoot Ajax 示例");

        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String home() {

        return "home";
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    @ResponseBody
    public List<talent> data( Integer tid) {
        System.out.println(tid);
        List<talent> list=talentservice.listTalent(tid);
        return list;
    }
}
