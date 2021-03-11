package com.smecsutalk.community.smecsutalk.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



// 这个注解的意思是允许这个class去接收前端的请求
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", required=false,
            defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
