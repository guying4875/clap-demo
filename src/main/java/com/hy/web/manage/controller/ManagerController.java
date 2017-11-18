package com.hy.web.manage.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.apache.struts.chain.contexts.ActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hy.entity.Manager;
import com.hy.web.manage.service.MangerService;

@Controller
@Scope("prototype")
@RequestMapping("manage")
public class ManagerController {
	@Autowired
	private MangerService managerService;
	
	 @RequestMapping("querylist")
	public ModelAndView getByPage(){
		List<Manager> list=managerService.getByPage();
		ModelAndView model=new ModelAndView("manage/list");
		model.addObject("list", list);
		return model;
	}
	 
	 @RequestMapping("toupdate")
	public ModelAndView updateUI(@RequestParam("id") int id){
		Manager manage=managerService.getById(id);
		ModelAndView mv=new ModelAndView("manage/update");
		mv.addObject("manage", manage);
		return mv;
	}
	 
	 @RequestMapping("doupdate")
	public String doUpdate(Manager manage){
		//
		return "forward:/manage/querylist.htm";
	}
	 
	 @ResponseBody
	 public ModelAndView getAll(){
		List<Manager> listManage=managerService.getAll();
		ModelAndView mv=new ModelAndView("manage/update");
		mv.addObject("listManage", listManage);
		return mv;
	 }
}
