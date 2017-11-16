package com.hy.web.manage.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.entity.Manager;
import com.hy.web.dao.ManagerDao;

@Service
public class ManagerServiceImpl implements MangerService {
	@Autowired	
	private ManagerDao managerDao;

	@Override
	public List<Manager> getByPage() {

		return managerDao.getByPage();
	}
}
