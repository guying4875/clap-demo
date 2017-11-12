package com.hy.web.server.controller;

import com.hy.entity.Page;
import com.hy.entity.User;
import com.hy.web.server.service.IServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhanghengyu
 * @description
 * @class com.hy.server.controller
 * @time 17-10-29 下午8:48
 */
@Controller
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private IServerService service;

    @RequestMapping("/list")
    public ModelAndView toList(@RequestParam(value="index",defaultValue ="1")int index, @RequestParam(value="page",defaultValue = "10")int pageSize){
        ModelAndView view = new ModelAndView("list/list");
        Page<User> page = new Page<User>();
        page.setCurrentIndex(index);
        page.setPageSize(pageSize);
        service.getPage(page);
        view.addObject("page",page);
        return view;
    }
}
