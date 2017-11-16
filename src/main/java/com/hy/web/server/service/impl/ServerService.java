package com.hy.web.server.service.impl;

import com.hy.dao.IUserDao;
import com.hy.entity.Page;
import com.hy.entity.User;
import com.hy.web.server.service.IServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghengyu
 * @description
 * @class com.hy.web.server.service.impl
 * @time 17-11-12 上午11:51
 */
@Service
public class ServerService implements IServerService {

    @Autowired
    private IUserDao dao;

    @Override
    public Page getPage(Page<User> page) {
        //调用service查询总行数
        int totail = dao.selectCountOfUser(page);
        page.setTotail(totail);
        List<User> userList = dao.selectPageOfUser(page);
        page.setDataList(userList);
        return page;
    }
}
