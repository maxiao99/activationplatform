/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.activationplatform.dao;

import com.github.fartherp.framework.core.dao.SqlMapDao;
import com.tyj.activationplatform.bean.bo.User;
import com.tyj.activationplatform.bean.dto.UserDto;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
public interface UserDao extends SqlMapDao<User, Integer> {

    List<UserDto> findPageUser(Map<String, Object> params);

    User findByLoginName(String loginName);
}