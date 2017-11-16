package com.hy.dao;

import com.hy.entity.Page;
import com.hy.entity.User;

import java.util.List;

public interface IUserDao {

    /**查询一页内容*/
    public List<User> selectPageOfUser(Page page);
    /**查询总行数*/
    public int selectCountOfUser(Page page);

}
