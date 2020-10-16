package cn.tedu.facility.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试SpringBoot使用
 */
@Controller
public class controller {
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }
}
