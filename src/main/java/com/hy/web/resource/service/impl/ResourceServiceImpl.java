package com.hy.web.resource.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.entity.Page;
import com.hy.entity.Resource;
import com.hy.web.dao.ResourceDao;
import com.hy.web.resource.service.ResourceService;
@Service
public class ResourceServiceImpl implements ResourceService {
	@Autowired
	private ResourceDao resourceDao;
	@Override
	public int getCountOfResource(Page<Resource> page) {
		
		return resourceDao.getCountOfResource(page);
	}

	@Override
	public List<Resource> getPageofResource(Page<Resource> page) {
		// TODO Auto-generated method stub
		return resourceDao.getPageofResource(page);
	}



	@Override
	public Resource getResourceById(int id) {
		// TODO Auto-generated method stub
		return resourceDao.getResourceById(id);
	}

	@Override
	public void deleteById(int id) {
		resourceDao.deleteById(id);
		
	}

	@Override
	public void updateResource(Resource resource) {
		resourceDao.updateResource(resource);
		
	}

	@Override
	public void doadd(String name, String url, int level, int state, Date createTime, Date modifyTime) {
		
		resourceDao.doadd(name,url,level,state,createTime,modifyTime);
	}

	
}
