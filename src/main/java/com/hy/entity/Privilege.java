package com.hy.entity;
/**
 * 权限实体类
 * pid int comment '权限id',
    pname varchar(40) comment '权限名称',
    tid int comment '父节点',
    control varchar(20) comment '控制器',
    method varchar(200) comment '控制方法',
	url varchar(200) comment '链接地址',
    plevel varchar(10) comment '用户等级 1:超级用户 2:一般用户 
 * @author Administrator
 *
 */
public class Privilege {
	private Integer pid;
	private String pname;
	private Integer tid;
	private String control;
	private String method;
	private String url;
	private String plevel;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getControl() {
		return control;
	}
	public void setControl(String control) {
		this.control = control;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPlevel() {
		return plevel;
	}
	public void setPlevel(String plevel) {
		this.plevel = plevel;
	}
	
}
