package cn.kk.tr4_3.controller;

import cn.kk.tr4.entity.WoUser;
import cn.kk.tr4.entity.Wrestler;
import cn.kk.tr4_3.service.MyService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/my")
public class MyController {
    @Autowired
    MyService myService;

    @ResponseBody
    @RequestMapping("/sayHi")
    public String sayHi(){
        String res = myService.sayHi();
        return res;
    }
    @RequestMapping("/ftl")
    public String ftl(Model model){
        model.addAttribute("message","freemarker works! 默认utf8");
        return "hello";
    }
    @ResponseBody
    @RequestMapping("/testNullPointer")
    public String testNullPointer(){
        Wrestler wrestler=null;
        return wrestler.getName();
    }
    @ResponseBody
    @RequestMapping("/testOutOfBounds")
    public String testOutOfBounds(){
        String[] strs=new String[]{"name1","name2"};
        return strs[2];
    }
    @ResponseBody
    @RequestMapping("/getUsersWithJdbc")
    public String getWoUsersWithJdbc(){
        List<WoUser> users = this.myService.getUsersWithJdbc();
        return JSON.toJSONString(users);
    }
    @ResponseBody
    @RequestMapping("/getUsersWithMybatis")
    public String getWoUsersWithMybatis(){
        List<WoUser> users = this.myService.getUsersWithMybatis();
        return JSON.toJSONString(users);
    }
}
