package com.hy.web.dao;

import java.util.Date;
import java.util.List;

import com.hy.entity.Page;
import com.hy.entity.Resource;

public interface ResourceDao {

	int getCountOfResource(Page<Resource> page);

	List<Resource> getPageofResource(Page<Resource> page);

	Resource getResourceById(int id);

	void deleteById(int id);

	void updateResource(Resource resource);

	void doadd(String name, String url, int level, int state, Date createTime, Date modifyTime);

}
