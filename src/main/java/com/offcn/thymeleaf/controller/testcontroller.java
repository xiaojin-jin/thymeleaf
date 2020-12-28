package com.offcn.thymeleaf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {

    @RequestMapping("/helloGit")
    public String hell(){
        System.out.println("--------------");
        return "success";
    }
}
