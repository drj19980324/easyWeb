package com.drj.easyweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String Login(){
        return "login";
    }

    @RequestMapping("index")
    public String Index(){
        return "index";
    }
}
