package com.hy.web.server.service.impl;

import com.hy.entity.Page;
import com.hy.entity.User;
import com.hy.web.server.service.IServerService;
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


    @Override
    public Page getPage(Page<User> page) {
        //调用service查询总行数
        int totail = 38;
        page.setTotail(totail);

        List<User> userList = new ArrayList<User>();
        //此处模拟从数据库查询对象
        for(int i=0;i<page.getPageSize();i++){
            User u = new User();
            u.setName("userName"+i);
            userList.add(u);
        }
        page.setDataList(userList);

        return page;
    }
}
