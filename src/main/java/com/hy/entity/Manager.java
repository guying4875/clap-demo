package com.hy.entity;

import java.util.Date;

/**
 * 	uid int primary key comment '管理员id',
    uname varchar(20) comment '管理登录',
    upassword varchar(20) comment '管理员登录密码',
	utime datetime comment '创建时间',
    rid int comment '角色id'
 * @author Administrator
 *
 */
public class Manager {
	private Integer uid;
	private String uname;
	private String upassword;
	private Date utime;
	private Role role;//角色管理
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public Date getUtime() {
		return utime;
	}
	public void setUtime(Date utime) {
		this.utime = utime;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
