package com.offcn.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstThymeleafController {
    /**
     * 访问http://localhost:8080/first
     * 将数据message填充到templates/index.html
     * @param model
     * @return
     */
    @GetMapping("/first")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";
        String message1 = "Hello, pkkkkkk!";
        model.addAttribute("message", message);
        model.addAttribute("message1", message1);
        return "index";
    }
//    @GetMapping("/index")
//    public String indexPage() {
//        System.out.println("进入了");
//        return "index";
//    }
}
