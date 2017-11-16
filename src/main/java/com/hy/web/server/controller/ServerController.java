package com.hy.web.server.controller;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

=======
import com.hy.entity.Page;
import com.hy.entity.User;
import com.hy.web.server.service.IServerService;
>>>>>>> branch 'master' of https://github.com/guying4875/clap-demo.git
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.servlet.ModelAndView;

import com.hy.entity.Employee;
import com.hy.entity.Server;
import com.hy.web.server.service.ServerService;
=======
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
>>>>>>> branch 'master' of https://github.com/guying4875/clap-demo.git

/**
 * @author zhanghengyu
 * @description
 * @class com.hy.server.controller
 * @time 17-10-29 下午8:48
 */
@Controller
@RequestMapping("/server")
public class ServerController {
<<<<<<< HEAD
	@Autowired
	private ServerService serverService;
		
    @RequestMapping("/list")
    public ModelAndView toList(){
    	List<Server> lists=serverService.getAll();
    	ModelAndView modelAndView = new ModelAndView("list/list");
    	modelAndView.addObject("lists", lists);
    	return modelAndView;
=======

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
>>>>>>> branch 'master' of https://github.com/guying4875/clap-demo.git
    }
}
