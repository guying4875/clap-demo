package com.hy.web.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhanghengyu
 * @description
 * @class com.hy.web.demo
 * @time 17-11-9 下午8:59
 */
@Controller
public class controller {

    @RequestMapping("form")
    public String toForm(){
        return "demo/form";
    }
    @RequestMapping("interface")
    public String toInterface(){
        return "demo/interface";
    }
    @RequestMapping("calendar")
    public String toCalendar(){
        return "demo/canlendar";
    }
}
