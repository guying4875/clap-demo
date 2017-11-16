package com.hy.web.manage.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hy.entity.Manager;
import com.hy.web.manage.service.MangerService;

@Controller
@Scope("prototype")
@RequestMapping("manage")
public class ManagerController {
	@Autowired
	private MangerService managerService;
	
	 @RequestMapping("getbypage")
	public ModelAndView getByPage(){
		List<Manager> list=managerService.getByPage();
		ModelAndView model=new ModelAndView("manage/list");
		model.addObject("list", list);
		return model;
	}
	 
	public String 
}
