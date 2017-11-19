package com.hy.entity;

import java.util.Date;

/**
 * 角色实体类
 * rid int primary key comment '角色id',
rname varchar(20) comment '角色名称',
pid int comment '权限id',
control varchar(20)
 * @author Administrator
 *
 */
public class Role {
	private Integer rid;
	private String rname;
	private String control;
	private Date createTime;
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getControl() {
		return control;
	}
	public void setControl(String control) {
		this.control = control;
	}

}
