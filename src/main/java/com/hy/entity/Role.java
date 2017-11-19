package com.hy.entity;

import java.util.Date;

/**
 * 角色实体类
 * 
 * @author Administrator
 *
 */
public class Role {
	private Integer id;
	private String name;
	private	Date createTime;
	private Date modifyTime;
	private String commont;
	
	public String getCommont() {
		return commont;
	}
	public void setCommont(String commont) {
		this.commont = commont;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}
