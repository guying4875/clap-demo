package com.hy.web.dao;

import java.util.List;

import com.hy.entity.Manager;

public interface ManagerDao {

	List<Manager> getByPage();

	Manager getById(Integer uid);

	List<Manager> getAll();

	


}
