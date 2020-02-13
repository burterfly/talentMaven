package com.talent.Controller;

import com.talent.entity.business;
import com.talent.entity.contract;
import com.talent.entity.talent;
import com.talent.service.StaffService;
import com.talent.service.TalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = {"/staff"})
public class StaffController {

    @Autowired
    private TalentService talentService;
    @Autowired
    private StaffService staffService;

    @RequestMapping(value = {"/Ucontract"})
    public String Ucontract(){
        return "leader/Ucontract";
    }
    @RequestMapping(value = {"/Ccontract"})
    public String Ccontract(){
        return "leader/Ccontract";
    }

    @RequestMapping(value = {"/Uexp"})
    public String Uexp(){
        return "leader/Uexp";
    }

    @RequestMapping(value = {"/Uwage"})
    public String Uwage(){
        return "leader/Uwage";
    }

    @RequestMapping(value = {"/Slot"})
    public String Slot(){
        return "Slot";
    }

    /**
     * 显示所有公司
     * @param
     * @return
     */
    @RequestMapping(value = {"/Company"}, method = RequestMethod.GET)
    @ResponseBody
    public List<business> Company(){
        List<business> allbusiness = talentService.listAllBusiness();
   //     model.addAttribute("allbusiness", allbusiness);
        System.out.println("显示所有公司"+allbusiness.size());
        return allbusiness;
    }

    /**
     * 显示所有工作人员
     * @param model 传递人员List
     * @return
     */
    @RequestMapping(value = {"/User"}, method = RequestMethod.GET)
    public String User(Model model){
        List<talent> allTalent = talentService.listAllTalent();
        model.addAttribute("allTalent", allTalent);
        System.out.println("显示所有工作人员"+allTalent.size());
        return "leader/User";
    }


    /**
     * 显示所有合同
     * @return
     */
    @RequestMapping(value = {"/Contract"}, method = RequestMethod.GET)
    @ResponseBody
    public List<contract> Contract(){
        List<contract> listcontract = staffService.listContract();

        System.out.println("显示所有合同"+listcontract.size());
        return listcontract;
    }

    /**
     * 删除 talent
     * @param model 传递人员List
     * @return
     */
    @RequestMapping(value = {"/delTalent"}, method = RequestMethod.GET)
    public String delTalent(Integer tid, Model model){
        //
        talentService.delTalent(tid);
        System.out.println("删除数据工作人员:"+tid);
        //从新刷新数据
        List<talent> allTalent = talentService.listAllTalent();
        model.addAttribute("allTalent", allTalent);

        return "leader/User";
    }
}
