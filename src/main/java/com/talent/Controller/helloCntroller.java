package com.talent.Controller;

import com.talent.entity.User;
import com.talent.entity.business;
import com.talent.service.TalentService;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = {"/hello"})
public class helloCntroller {

    @Autowired
    private TalentService talentService;

    @RequestMapping(value = {"/index1"})
        public String hello(){
            return "index1";
        }
    @RequestMapping(value = {"/ModelForm"})
    public String ModelForm(){
        return "ModelForm";
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

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form() {
        return "FormExamble";
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    @ResponseBody
    public List<business> data() {
        List<business> allbusiness = talentService.listAllBusiness();
        //     model.addAttribute("allbusiness", allbusiness);
        System.out.println("测试一下显示所有公司"+allbusiness.size());
        return allbusiness;
    }

    @RequestMapping(value = "/data1", method = RequestMethod.GET)
    @ResponseBody
    public List<User> data1() {

        System.out.println("测试一下实现跳转");
        List<User> list = new ArrayList<User>();

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i + 1);
            user.setName("springboot" + i);
            user.setSex("male");
            user.setAge(i + 1);
            user.setRole("developer");

            list.add(user);
        }

        return list;
    }
}
