package com.hy.web.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.entity.Server;
import com.hy.web.dao.ServerDao;
import com.hy.web.server.service.ServerService;

@Service
public class ServerServiceImpl implements ServerService {
	@Autowired
	private ServerDao dao;
	
	@Override
	public List<Server> getAll() {
		
		return dao.getAll();
	}

}
