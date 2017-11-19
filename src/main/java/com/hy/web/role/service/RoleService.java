package com.hy.web.role.service;

import java.util.List;

import com.hy.entity.Page;
import com.hy.entity.Role;

public interface RoleService {


	int getCountOfRole(Page<Role> page);

	List<Role> getDataOfRole(Page<Role> page);

}
