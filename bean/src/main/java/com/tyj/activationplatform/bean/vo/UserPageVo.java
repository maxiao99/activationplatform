/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.activationplatform.bean.vo;

import com.github.fartherp.framework.core.vo.BaseVo;
import com.tyj.activationplatform.bean.dto.UserDto;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/12
 */
public class UserPageVo extends BaseVo<UserDto> {
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
