package com.hy.web.login.controller;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class TestVelocity {
	public static void main(String[] args) {
		//初始化模板引擎
		VelocityEngine ve=new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();
		//获取模板
		Template temp = ve.getTemplate("hello.vm");
		//设置变量
		VelocityContext vc=new VelocityContext();
		vc.put("name", "Velocity");
		List list=new ArrayList();
		list.add("1");
		list.add("2");
		vc.put("list", list);
		//输出
		StringWriter writer = new StringWriter();
		temp.merge(vc, writer);
		System.out.println(writer.toString());
	}
}
