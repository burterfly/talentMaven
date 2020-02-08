package com.talent.Controller;

import com.talent.entity.account;
import com.talent.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = {"/user"})
public class accountLogin {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = "springboot", method = RequestMethod.GET)
    public String show(Model model){
        model.addAttribute("uid","123456789");
        model.addAttribute("myname","Jerry");
        return "springboot";
    }

    /**
     * 跳转到登录页面
     * @return 返回登录页面
     */
    @RequestMapping(value = {"/loginHtml"})
    public String hello(){
        return "userLogin";
    }

    /**
     * 跳转到注册界面
     * @return 返回注册界面
     */
    @RequestMapping(value = {"/registerpage"})
    public String register(Model model) {
        return "register";
    }

    /**
     * 获取用户名与密码，用户登录
     * @return 登录成功页面
     */
    @RequestMapping(value = {"/userLogin"})
    public String userLogin(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request){

        account user = userLoginService.userLogin(username,password);

        if(user != null){                                                  //登录成功
            request.getSession().setAttribute("session_user",user);     //将用户信息放入session
            return "index1";
        }
        return "loginError";
    }

    /**
     * 注册新用户
     * @return 注册结果
     */
    @RequestMapping(value = {"/uregister"})
    public String addUser(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          @RequestParam("password2") String password2,
                          @RequestParam("age") int age,Model model){

        if(!password.equals(password2)){

            return "两次密码不相同，注册失败！！";
        }else {
            int res = userLoginService.adduser(username,password,age);
            String name = "";
            if(res == 0){
                name = "注册失败";
            }else {
                name = "注册成功";
            }
            model.addAttribute("result", name);
            return "register";
        }

    }

}


