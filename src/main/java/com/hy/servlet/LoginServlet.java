package com.hy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hy.util.MD5Utils;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.login(req, resp);
	}
	
	public String login(HttpServletRequest req, HttpServletResponse resp){
		String username = req.getParameter("username");
		String password = req.getParameter("password");
//		UserService us=new UserServiceImpl();
//		User user=us.findUserByNmaeAndPw(username,MD5Utils.getPwd(password));
//		if(user!=null){
//			
//		}
		return null;
	}

}
