package com.offcn.thymeleaf.controller;

import com.offcn.thymeleaf.entity.User;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SecondThymeleafController {
    /**
     * 访问localhost:8080 页面
     * 将数据message填充到templates/index2.html
     * @param model
     * @return
     */
    @GetMapping("/second")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";
        User u = new User(1,"潘裤裤",18);

        Map<String,Object> map=new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("message", message);
        model.addAttribute("user", u);
        model.addAttribute("map", map);
      
        return "index2";
    }

    @RequestMapping("/index3")
    public String index3page(Model model){
        User u1 = new User(1,"pkk",20);
        User u2 = new User(2,"cjj",28);
        User u3 = new User(3,"llg",24);
        User u4 = new User(4,"sda",26);
        List<User> list = new ArrayList<User>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        model.addAttribute("userList",list);
        return "index3";
    }

    @RequestMapping("/index4")
    public String index4page(Model model){
        model.addAttribute("username","pkk");
        model.addAttribute("href", "http://www.ujiuye.com");
        return "index4";
    }

    @RequestMapping("/index5")
    public String index5page(Model model){
        model.addAttribute("result","yes");
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");

        return "index5";
    }
}