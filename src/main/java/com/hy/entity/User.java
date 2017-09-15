package com.hy.entity;
/**
 * 用户对象
 * @author zhanghy
 *
 */
public class User {
	/**
	 * id
	 */
	private int id;
	/**
	 * name
	 */
	private String name;
	/**
	 * 登录账号  - 对应数据库account字段
	 */
	private String loginName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

}
