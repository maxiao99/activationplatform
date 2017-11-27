/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.activationplatform.service.impl;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.github.fartherp.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.tyj.activationplatform.bean.bo.User;
import com.tyj.activationplatform.bean.dto.UserDto;
import com.tyj.activationplatform.dao.UserDao;
import com.tyj.activationplatform.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
@Service("userService")
public class UserServiceImpl extends GenericSqlMapServiceImpl<User, Integer> implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    public SqlMapDao<User, Integer> getDao() {
        return userDao;
    }

    public List<UserDto> findPageUser(Map<String, Object> params) {
        return userDao.findPageUser(params);
    }

    public User findByLoginName(String loginName) {
        return userDao.findByLoginName(loginName);
    }
}