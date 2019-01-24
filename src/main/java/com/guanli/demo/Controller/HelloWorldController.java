package com.guanli.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/login")
public class HelloWorldController {
    @RequestMapping("/index")
    public String login() {
        return "login/index";
    }
}
