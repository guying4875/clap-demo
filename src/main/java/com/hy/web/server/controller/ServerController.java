package com.hy.web.server.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hy.entity.Employee;
import com.hy.entity.Server;
import com.hy.web.server.service.ServerService;

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
	private ServerService serverService;
		
    @RequestMapping("/list")
    public ModelAndView toList(){
    	List<Server> lists=serverService.getAll();
    	ModelAndView modelAndView = new ModelAndView("list/list");
    	modelAndView.addObject("lists", lists);
    	return modelAndView;
    }
}
