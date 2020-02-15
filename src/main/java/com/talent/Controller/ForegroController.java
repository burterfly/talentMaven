package com.talent.Controller;

import com.talent.entity.account;
import com.talent.entity.business;
import com.talent.entity.talent;
import com.talent.service.TalentService;
import com.talent.service.businessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = {"/foregro"})
public class ForegroController {
    @Autowired
    private businessService businessservice;
    @Autowired
    private TalentService talentservice;

    @RequestMapping(value = {"/businesslogin"})
    public String businesslogin(@RequestParam("username") String username,
                                @RequestParam("password") String password,
                                HttpSession session){
        System.out.println(username);
        System.out.println(password);
        business user =businessservice.businesslogin(username,password);
        if(user != null){
            Integer bid=user.getBid();
            session.setAttribute("bid", bid);
            return "redirect:/business/listBusiness?bid="+bid;
        }
        return "foregro/loginError";
    }

    @RequestMapping(value = {"/talentlogin"})
    public String talentlogin(@RequestParam("username") String username,
                                @RequestParam("password") String password,
                                HttpSession session){
        talent user =talentservice.talentlogin(username,password);
        if(user != null){
            Integer tid=user.getTid();
            session.setAttribute("tid", tid);
            return "redirect:/talent/listTalent?tid="+tid;
        }
        return "foregro/loginError";
    }

    @RequestMapping(value ="/toregister", method = RequestMethod.GET)
    public String toregister(Integer a,Model model){
        return "foregro/register";
    }

    @RequestMapping(value ="/talentregister")
    public String talentregister(@RequestParam("Tusername") String Tusername,
                                 @RequestParam("Tpassword") String Tpassword,
                                 @RequestParam("Tname") String Tname,
                                 @RequestParam("Tage") Integer Tage,
                                 @RequestParam("Tsex") String Tsex,
                                 @RequestParam("Tcer") String Tcer,
                                 @RequestParam("Tedu") String Tedu,
                                 @RequestParam("Tpro") String Tpro) {
              talent talent=new talent();
              talent.setTusername(Tusername);
              talent.setTpassword(Tpassword);
              talent.setTname(Tname);
              talent.setTage(Tage);
              talent.setTsex(Tsex);
              talent.setTcer(Tcer);
              talent.setTedu(Tedu);
              talent.setTpro(Tpro);
              System.out.println("ok");
              talentservice.talentregister(talent);
        return "foregro/login";
    }

    @RequestMapping(value ="/businessregister")
    public String businessregister(@RequestParam("Busername") String Busername,
                                 @RequestParam("Bpassword") String Bpassword,
                                 @RequestParam("Bname") String Bname,
                                 @RequestParam("Baddress") String Baddress,
                                 @RequestParam("Btime") String Btime,
                                 @RequestParam("Bservice") String Bservice) {
        business business=new business();
        business.setBusername(Busername);
        business.setBpassword(Bpassword);
        business.setBname(Bname);
        business.setBaddress(Baddress);
        business.setBtime(Btime);
        business.setBservice(Bservice);
        System.out.println("ok");
        businessservice.businessregister(business);
        return "foregro/login";
    }
}
