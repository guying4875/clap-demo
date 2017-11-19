package com.hy.web.resource.service;

import java.util.Date;
import java.util.List;

import com.hy.entity.Page;
import com.hy.entity.Resource;

public interface ResourceService {

	int getCountOfResource(Page<Resource> page);

	List<Resource> getPageofResource(Page<Resource> page);

	Resource getResourceById(int id);

	void deleteById(int id);


	void updateResource(Resource resource);

	void doadd(Resource resource);

}
