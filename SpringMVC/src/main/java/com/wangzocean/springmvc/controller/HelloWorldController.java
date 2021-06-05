package com.wangzocean.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Zocean
 */
@Controller
public class HelloWorldController {
    //起一个门牌号
    @RequestMapping("first")
    public String hello(Model model) {

        model.addAttribute("msg", "Hello World");

        //这样写只能用jsp技术
        //return “first.jsp”

        //逻辑视图名：没有指定具体视图技术
        return "first";
    }

}
