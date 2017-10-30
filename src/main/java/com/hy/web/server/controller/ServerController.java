package com.hy.web.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhanghengyu
 * @description
 * @class com.hy.server.controller
 * @time 17-10-29 下午8:48
 */
@Controller
@RequestMapping("/server")
public class ServerController {

    @RequestMapping("/list")
    public String toList(){

        return "list/list";
    }
}
