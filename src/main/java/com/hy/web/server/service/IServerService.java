package com.hy.web.server.service;

import com.hy.entity.Page;
import com.hy.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author zhanghengyu
 * @description
 * @class com.hy.web.server.service
 * @time 17-11-12 上午11:50
 */
public interface IServerService {

    /**
     * 查询一页内容
     * @param page
     * @return
     */
    public Page getPage(Page<User> page);

}
