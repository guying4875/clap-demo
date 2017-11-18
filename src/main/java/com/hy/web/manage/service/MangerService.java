package com.hy.web.manage.service;

import java.util.List;

import com.hy.entity.Manager;

public interface MangerService {

	List<Manager> getByPage();

	Manager getById(Integer uid);

	List<Manager> getAll();


	
}
