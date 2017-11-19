package com.hy.web.resource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hy.entity.Page;
import com.hy.entity.Resource;
import com.hy.web.resource.service.ResourceService;

@Controller
@RequestMapping("resource")
public class ResourceController {
	@Autowired
	private ResourceService resourceService;
	@RequestMapping("list")
	public ModelAndView toList(@RequestParam(value="index",defaultValue="1") int index,@RequestParam(value="page",defaultValue="3")int pageSize){
		ModelAndView mv=new ModelAndView("resource/list");
		Page<Resource> page=new Page<Resource>();
		page.setCurrentIndex(index);
		page.setPageSize(pageSize);
		int totalcount=resourceService.getCountOfResource(page);
		page.setTotail(totalcount);
		List<Resource> listResource=resourceService.getPageofResource(page);
		page.setDataList(listResource);
		mv.addObject("page",page);
		return mv;
		}

	@RequestMapping("toAdd")
	public ModelAndView toAdd(){
		ModelAndView mv=new ModelAndView("resource/add");
		return mv;
	}

	@RequestMapping("doadd")
	public String doadd(@RequestParam("name")String name,@RequestParam("url")String url,
			@RequestParam("level")int level,@RequestParam("state")int state){
		resourceService.doadd(name,url,level,state);
		return "forward:/resource/list.htm";
	}
	@RequestMapping("toupdate")
	public ModelAndView toupdate(@RequestParam("id") int id){
		ModelAndView mv=new ModelAndView("resource/update");
		 Resource resource=resourceService.getResourceById(id);
		 mv.addObject("resource", resource);
		 return mv;
	}

	@RequestMapping("doupdate")
	public String doupdate(Resource resource){
		resourceService.updateResource(resource);

		 return "redirect:/resource/list.htm";
	}

	@RequestMapping("delete")
	public String delete(@RequestParam("id") int id){
		resourceService.deleteById(id);
		return "redirect:/resource/list.htm";
	}
}
