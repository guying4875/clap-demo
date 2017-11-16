package com.hy.web.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping("/tologin")
	public String toLogin(){
		return "login/login";
	}
	@ResponseBody
	@RequestMapping("/login")
	public String login(@RequestParam("loginname")String loginName ,@RequestParam("pw")String pw){
		System.out.println(loginName+" "+pw);
		return "";
	}
}
