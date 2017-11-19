package com.hy.web.role.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hy.entity.Page;
import com.hy.entity.Role;
import com.hy.web.role.service.RoleService;

@Controller
@RequestMapping("role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	@RequestMapping("list")
	public ModelAndView toList(@RequestParam(value="index",defaultValue="1") int index,@RequestParam(value="page",defaultValue="3") int pagesize){
		Page<Role> page=new Page<Role>();
		page.setCurrentIndex(index);
		page.setPageSize(pagesize);
		int totalCount=roleService.getCountOfRole(page);
		List<Role> datalist=roleService.getDataOfRole(page);
		page.setTotail(totalCount);
		page.setDataList(datalist);
		ModelAndView mv=new ModelAndView("role/list");
		mv.addObject("page", page);
		return mv;
	}
	
	
}
