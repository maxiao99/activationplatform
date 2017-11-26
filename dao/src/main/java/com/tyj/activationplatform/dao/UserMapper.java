/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.activationplatform.dao;

import com.github.fartherp.framework.core.dao.DaoMapper;
import com.github.fartherp.framework.core.orm.mybatis.annotation.SqlMapper;
import com.tyj.activationplatform.bean.bo.User;
import com.tyj.activationplatform.bean.dto.UserDto;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
@SqlMapper
public interface UserMapper extends DaoMapper<User, Integer> {
    List<UserDto> findPageUser(Map<String, Object> params);
}