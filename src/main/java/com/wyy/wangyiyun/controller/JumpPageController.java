package com.wyy.wangyiyun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpPageController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
