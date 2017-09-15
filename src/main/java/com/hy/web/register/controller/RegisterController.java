package com.hy.web.register.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 用户注册功能
 * @author zhanghy
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
	
	/**
	 * 跳转到注册页面
	 * @return
	 */
	@RequestMapping("toregister")
	public String toRegister(){
		return "register/register";
	}
	/**
	 * 保存注册信息
	 * @param request
	 * @return
	 */
	@RequestMapping("doregister")
	public String doRegister(HttpServletRequest request){
		//调用服务层程序保存注册信息
		
		return "";
	}

}
