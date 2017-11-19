package com.hy.web.role.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.entity.Page;
import com.hy.entity.Role;
import com.hy.web.dao.RoleDao;
import com.hy.web.role.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;

	@Override
	public int getCountOfRole(Page<Role> page) {
		// TODO Auto-generated method stub
		return roleDao.getCountOfRole(page);
	}

	@Override
	public List<Role> getDataOfRole(Page<Role> page) {
		// TODO Auto-generated method stub
		return roleDao.getDataOfRole(page);
	}
	
}
