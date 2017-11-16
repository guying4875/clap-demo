package com.hy.entity;

import java.util.Date;

public class Server {
	private Integer serveId;
	private Date serveBegin;
	private Date serveEnd;
	private Double serveInsure;
	private Double serveAmount;
	private Employee emp;
	
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Integer getServeId() {
		return serveId;
	}
	public void setServeId(Integer serveId) {
		this.serveId = serveId;
	}
	public Date getServeBegin() {
		return serveBegin;
	}
	public void setServeBegin(Date serveBegin) {
		this.serveBegin = serveBegin;
	}
	public Date getServeEnd() {
		return serveEnd;
	}
	public void setServeEnd(Date serveEnd) {
		this.serveEnd = serveEnd;
	}
	public Double getServeInsure() {
		return serveInsure;
	}
	public void setServeInsure(Double serveInsure) {
		this.serveInsure = serveInsure;
	}
	public Double getServeAmount() {
		return serveAmount;
	}
	public void setServeAmount(Double serveAmount) {
		this.serveAmount = serveAmount;
	}
	
}
