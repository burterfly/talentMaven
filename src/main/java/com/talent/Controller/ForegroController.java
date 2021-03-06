package com.talent.Controller;

import com.talent.entity.*;
import com.talent.service.TalentService;
import com.talent.service.businessService;
import com.talent.service.foregroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = {"/foregro"})
public class ForegroController {
    @Autowired
    private businessService businessservice;
    @Autowired
    private TalentService talentservice;
    @Autowired
    private foregroService foregroservice;

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


    @RequestMapping(value = {"/stafflogin"})
    public String stafflogin(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              HttpSession session){
        staff user =foregroservice.stafflogin(username,password);
        if(user != null){
            return "redirect:/staff/User";
        }
        return "foregro/loginError";
    }

    @RequestMapping(value ="/toregister", method = RequestMethod.GET)
    public String toregister(HttpSession session){
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

    @RequestMapping(value ="/toindex", method = RequestMethod.GET)
    public String toindex(){
        return "foregro/index";
    }
    @RequestMapping(value ="/toabout", method = RequestMethod.GET)
    public String toabout(){
        return "foregro/about";
    }

    @RequestMapping(value ="/toalbum")
    public String toalbum(Model model)
    {
        List<business> listalbum = businessservice.listAllBusiness();
        model.addAttribute("listalbum", listalbum);
        System.out.println(listalbum.size());
        return "foregro/album";
    }


    @RequestMapping(value ="/toalbum_detail")
    public String toalbum_detail(Integer bid,Model model){
        System.out.println(bid+"细节");
        business listbusiness=businessservice.listBusiness(bid);
        model.addAttribute("listbusiness", listbusiness);
        return "foregro/album_detail";
    }

    @RequestMapping(value ="/toarticle_details")
    public String toarticle_details(Model model){
        List<experience> listallpublic=foregroservice.listallpublic();
        for (int i = 0; i < listallpublic.size(); i++) {
            String name;
            String address;
            Integer j=listallpublic.get(i).getBid();
            name = businessservice.listBusiness(j).getBname();
            address = businessservice.listBusiness(j).getBaddress();

            listallpublic.get(i).setBname(name);
            listallpublic.get(i).setEother(address);
        }

        model.addAttribute("listallpublic", listallpublic);
        return "foregro/article_details";
    }

    @RequestMapping(value ="/toarticle", method = RequestMethod.GET)
    public String toarticle(){
        return "foregro/article";
    }
    @RequestMapping(value ="/toarticle_detail", method = RequestMethod.GET)
    public String toarticle_detail(){
        return "foregro/article_detail";
    }
    @RequestMapping(value ="/tocomment", method = RequestMethod.GET)
    public String tocomment(){
        return "foregro/comment";
    }
    @RequestMapping(value ="/tocontact", method = RequestMethod.GET)
    public String tocontract(){
        return "foregro/contact";
    }
    @RequestMapping(value ="/toproduct", method = RequestMethod.GET)
    public String toproduct(){
        return "foregro/product";
    }

}
