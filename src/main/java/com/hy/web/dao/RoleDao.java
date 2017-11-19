package com.hy.web.dao;

import java.util.List;

import com.hy.entity.Page;
import com.hy.entity.Role;

public interface RoleDao {

	int getCountOfRole(Page<Role> page);

	List<Role> getDataOfRole(Page<Role> page);

}
