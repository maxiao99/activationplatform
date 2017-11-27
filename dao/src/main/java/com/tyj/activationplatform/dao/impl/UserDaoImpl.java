/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.activationplatform.dao.impl;

import com.github.fartherp.framework.core.dao.ConfigurableBaseSqlMapDao;
import com.github.fartherp.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.tyj.activationplatform.bean.bo.User;
import com.tyj.activationplatform.bean.dto.UserDto;
import com.tyj.activationplatform.dao.UserDao;
import com.tyj.activationplatform.dao.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
@Repository("userDao")
public class UserDaoImpl extends ConfigurableBaseSqlMapDao<User, Integer> implements UserDao {
    @Autowired
    private UserMapper userMapper;

    public DaoMapper<User, Integer> getDaoMapper() {
        return userMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public List<UserDto> findPageUser(Map<String, Object> params) {
        return userMapper.findPageUser(params);
    }

    public User findByLoginName(String loginName) {
        return userMapper.findByLoginName(loginName);
    }
}