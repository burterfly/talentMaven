package com.talent.Controller;

import  org.springframework.stereotype.Controller;
import  org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/hello"})
public class helloCntroller {

    @RequestMapping(value = {"/springboot"})
        public String hello(){
            return "HelloWord";
        }
}
