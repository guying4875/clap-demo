package com.hy.entity;

import java.util.Date;

public class Resource {
	private int id;
	private String name;
	private String url;
	private int level;
	private int parentId;
	private int menuFlag = 0;
	private int state;
	private Date createTime;
	private Date modifyTime;

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMenuFlag() {
		return this.menuFlag;
	}

	public void setMenuFlag(int menuFlag) {
		this.menuFlag = menuFlag;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public int getId() {
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}

	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}




}
