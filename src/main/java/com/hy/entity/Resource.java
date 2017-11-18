package com.hy.entity;

import java.util.Date;

public class Resource {
	private Integer id;
	private String name;
	private String url;
	private Integer level;
	private Integer parent_id;
	private Integer is_menu;
	private Integer state;
	private Date create_time;
	private Date modify_time;
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
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	public Integer getIs_menu() {
		return is_menu;
	}
	public void setIs_menu(Integer is_menu) {
		this.is_menu = is_menu;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getModify_time() {
		return modify_time;
	}
	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}
	@Override
	public String toString() {
		return "Resource [id=" + id + ", name=" + name + ", url=" + url + ", level=" + level + ", parent_id="
				+ parent_id + ", is_menu=" + is_menu + ", state=" + state + ", create_time=" + create_time
				+ ", modify_time=" + modify_time + "]";
	}
	
	
	 
}
