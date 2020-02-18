package com.talent.Controller;

import com.talent.entity.*;
import com.talent.service.StaffService;
import com.talent.service.TalentService;
import com.talent.service.businessService;
import com.talent.service.foregroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = {"/staff"})
public class StaffController {

    @Autowired
    private TalentService talentService;
    @Autowired
    private StaffService staffService;
    @Autowired
    private businessService businessservice;
    @Autowired
    private foregroService foregroservice;



    @RequestMapping(value = {"/Ucontract"})
    public String Ucontract() {
        return "leader/Ucontract";
    }

    @RequestMapping(value = {"/Ccontract"})
    public String Ccontract() {
        return "leader/Ccontract";
    }

    @RequestMapping(value = {"/Uexp"})
    public String Uexp() {
        return "leader/Uexp";
    }

    @RequestMapping(value = {"/Uwage"})
    public String Uwage() {
        return "leader/Uwage";
    }

    @RequestMapping(value = {"/Slot"})
    public String Slot() {
        return "Slot";
    }

    /**
     * 显示所有公司
     *
     * @param
     * @return
     */
 //   @RequestMapping(value = {"/Company"}, method = RequestMethod.GET)
 //   @ResponseBody
////    public List<business> Company() {
//        List<business> allbusiness = talentService.listAllBusiness();
 //       System.out.println("显示所有公司" + allbusiness.size());
 //       return allbusiness;
//    }

       @RequestMapping(value = {"/Company"}, method = RequestMethod.GET)
      public String Company(Model model){
        List<business> allbusiness = talentService.listAllBusiness();
      model.addAttribute("allbusiness", allbusiness);

        return "leader/Company";
    }

    /**
     * 显示所有工作人员
     *
     * @param model 传递人员List
     * @return
     */
    @RequestMapping(value = {"/User"}, method = RequestMethod.GET)
    public String User(Integer id,Model model) {
        List<talent> allTalent = talentService.listAllTalent();
        model.addAttribute("allTalent", allTalent);

        return "leader/User";
    }


    /**
     * 显示所有合同
     *
     * @return
     */
    @RequestMapping(value = {"/Contract"}, method = RequestMethod.GET)
    @ResponseBody
    public List<contract> Contract() {
        List<contract> listcontract = staffService.listContract();

        return listcontract;
    }

    /**
     * 删除 talent
     *
     * @param model 传递人员List
     * @return
     */
    @RequestMapping(value = {"/delTalent"}, method = RequestMethod.GET)
    public String delTalent(Integer tid, Model model) {
        //
        talentService.delTalent(tid);

        //从新刷新数据
        List<talent> allTalent = talentService.listAllTalent();
        model.addAttribute("allTalent", allTalent);

        return "leader/User";
    }

    @RequestMapping(value = "/updateTalent", method = RequestMethod.POST)
    public String updateTalent(@RequestParam("Tid") Integer Tid,
                               @RequestParam("Tusername") String Tusername,
                               @RequestParam("Tpassword") String Tpassword,
                               @RequestParam("Tname") String Tname,
                               @RequestParam("Tage") Integer Tage,
                               @RequestParam("Tsex") String Tsex,
                               @RequestParam("Tcer") String Tcer,
                               @RequestParam("Tedu") String Tedu,
                               @RequestParam("Tpro") String Tpro, Model model) {
        talent talent = new talent();
        talent.setTid(Tid);
        talent.setTusername(Tusername);
        talent.setTpassword(Tpassword);
        talent.setTname(Tname);
        talent.setTage(Tage);
        talent.setTsex(Tsex);
        talent.setTcer(Tcer);
        talent.setTedu(Tedu);
        talent.setTpro(Tpro);

        talentService.talentUpdate(talent);

        List<talent> allTalent = talentService.listAllTalent();
        model.addAttribute("allTalent", allTalent);
        return "leader/User";
    }


    @RequestMapping(value = "/addTalent", method = RequestMethod.POST)
    public String addTalent(
            @RequestParam("Tusername") String Tusername,
            @RequestParam("Tpassword") String Tpassword,
            @RequestParam("Tname") String Tname,
            @RequestParam("Tage") Integer Tage,
            @RequestParam("Tsex") String Tsex,
            @RequestParam("Tcer") String Tcer,
            @RequestParam("Tedu") String Tedu,
            @RequestParam("Tpro") String Tpro, Model model) {
        talent talent = new talent();

        talent.setTusername(Tusername);
        talent.setTpassword(Tpassword);
        talent.setTname(Tname);
        talent.setTage(Tage);
        talent.setTsex(Tsex);
        talent.setTcer(Tcer);
        talent.setTedu(Tedu);
        talent.setTpro(Tpro);
        System.out.println("添加员工");
        talentService.talentregister(talent);

        List<talent> allTalent = talentService.listAllTalent();
        model.addAttribute("allTalent", allTalent);
        return "leader/User";
    }

    @ResponseBody
    @RequestMapping(value = {"/requrstTalent"}, method = RequestMethod.POST)
    public talent listTalent(Integer tid, Model model) {
        talent targetTalent = talentService.RequrstTalentByTid(tid);

        return targetTalent;
    }

    /**
     * 删除 talent
     *
     * @param model 传递人员List
     * @return
     */
    @RequestMapping(value = {"/delbusiness"}, method = RequestMethod.GET)
    public String delbusiness(Integer bid, Model model) {
        staffService.delbusiness(bid);
        List<business> allbusiness = talentService.listAllBusiness();
        model.addAttribute("allbusiness", allbusiness);
        return "leader/Company";
    }


    @ResponseBody
    @RequestMapping(value = {"/requrstBusiness"}, method = RequestMethod.POST)
    public business listBusiness(Integer bid, Model model) {
        business targetBusiness = staffService.RequrstBusinessByBid(bid);

        return targetBusiness;
    }


    @RequestMapping(value = "/updateBusiness", method = RequestMethod.POST)
    public String updateBusiness(@RequestParam("Bid") Integer Bid,
                                 @RequestParam("Busername") String Busername,
                                 @RequestParam("Bpassword") String Bpassword,
                                 @RequestParam("Bname") String Bname,
                                 @RequestParam("Baddress") String Baddress,
                                 @RequestParam("Btime") String Btime,
                                 @RequestParam("Bservice") String Bservice,
                                 Model model) {
            business business=new business();
            business.setBid(Bid);
            business.setBusername(Busername);
            business.setBpassword(Bpassword);
            business.setBname(Bname);
            business.setBaddress(Baddress);
            business.setBtime(Btime);
            business.setBservice(Bservice);
            staffService.businessUpdate(business);

            List<business> allbusiness = talentService.listAllBusiness();
            model.addAttribute("allbusiness", allbusiness);


        return "leader/Company";
    }


    @RequestMapping(value = "/addBusiness", method = RequestMethod.POST)
    public String addBusiness(
            @RequestParam("Busername") String Busername,
            @RequestParam("Bpassword") String Bpassword,
            @RequestParam("Bname") String Bname,
            @RequestParam("Baddress") String Baddress,
            @RequestParam("Btime") String Btime,
            @RequestParam("Bservice") String Bservice,
            Model model) {
        business business = new business();

        business.setBusername(Busername);
        business.setBpassword(Bpassword);
        business.setBname(Bname);
        business.setBaddress(Baddress);
        business.setBtime(Btime);
        business.setBservice(Bservice);
        staffService.businessregister(business);
        List<business> allbusiness = talentService.listAllBusiness();
        model.addAttribute("allbusiness", allbusiness);
        return "leader/Company";
    }

    @RequestMapping(value = {"/wages"}, method = RequestMethod.GET)
    public String wages(Integer tid, Model model,HttpSession session) {
         session.setAttribute("mtid",tid);
        List<money> listmoney = talentService.listMoney(tid);
        model.addAttribute("listmoney", listmoney);
        return "leader/Wages";
    }


    @RequestMapping(value = "/addWages", method = RequestMethod.POST)
    public String addWages(@RequestParam("Mtime") String Mtime,
            @RequestParam("Mjob") String Mjob,
            @RequestParam("Mmoney") String Mmoney,
            Model model,HttpSession session) {
        money money = new money();
        Integer  Mtid= (Integer) session.getAttribute("mtid");
        money.setMtime(Mtime);
        money.setMjob(Mjob);
        money.setMmoney(Mmoney);
        money.setTid(Mtid);
        staffService.addWages(money);
        List<money> listmoney = talentService.listMoney(Mtid);
        model.addAttribute("listmoney", listmoney);
        return "leader/Wages";
    }


    @RequestMapping(value ="/Public")
    public String Public(Model model){
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
        return"leader/Public";
    }

    @RequestMapping(value ="/updatePublic")
    public String updatePublic(Integer eid,String tusername,Model model){
        Integer Tid=talentService.TalentByTusername(tusername).getTid();
        experience  experience = new experience();
        experience.setTid(Tid);
        experience.setEid(eid);
        staffService.experienceUpdate(experience);
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
        return"leader/Public";
    }


}


