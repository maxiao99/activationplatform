/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.activationplatform.web.controller;

import com.github.fartherp.framework.common.util.DateUtil;
import com.github.fartherp.framework.core.util.JsonResp;
import com.tyj.activationplatform.bean.dto.UserDto;
import com.tyj.activationplatform.bean.vo.UserPageVo;
import com.tyj.activationplatform.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: CK
 * @date: 2017/11/26
 */
@Controller
@RequestMapping("/user")
public class UserController extends AbstractController {

    @Resource
    UserService userService;

    /**
     * @api {post} user/page/list 用户列表
     * @apiVersion 1.0.0
     * @apiName findUserList
     * @apiGroup User
     * @apiDescription 用户列表分页
     *
     * @apiParam {String} keyword
     * @apiParam {Number} currentPage 当前页
     * @apiParam {Number} limit 页大小
     *
     * @apiUse ReturnCommonFiled
     * @apiSuccess {Object} data
     * @apiSuccess {Number} data.total 总记录数
     * @apiSuccess {Object[]} data.rows 用户列表
     * @apiSuccess {Number} data.rows.id 用户ID
     * @apiSuccess {String} data.rows.name 姓名
     * @apiSuccess {String} data.rows.password 密码
     * @apiSuccess {String} data.rows.email 邮箱
     * @apiSuccess {String} data.rows.phone 手机号
     * @apiSuccess {Number} data.rows.roleId 角色ID
     * @apiSuccess {Number} data.rows.sex 性别，冻结 1: 男 2: 女
     * @apiSuccess {Number} data.rows.status 状态，冻结 1: 可用 2: 禁用
     * @apiSuccess {String} data.rows.createTime 创建时间
     * @apiSuccess {String} data.rows.roleName 角色名称
     * @apiSuccessExample Request (example)
     *  {
     *      "keyword": "",
     *      "currentPage": 1,
     *      "limit": 10
     *  }
     * @apiSuccessExample Response (example)
     *  {
     *      "status": 0,
     *      "statusInfo": "",
     *      "data": {
     *          "total": 14,
     *          "rows": [
     *              {
     *                  "id": 1,
     *                  "name": "admin",
     *                  "password": "21232f297a57a5a743894a0e4a801fc3",
     *                  "email": "123456@qq.com",
     *                  "phone": "18611714798",
     *                  "roleId": 1,
     *                  "sex": 1,
     *                  "status": 1,
     *                  "createTime": "2017-11-26 09:25:03",
     *                  "roleName": "管理员"
     *              }
     *          ]
     *      }
     *  }
     */
    @ResponseBody
    @RequestMapping(value = "/page/list")
    public String list(UserPageVo vo) {
        List<UserDto> l = userService.findPageUser(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd_HH_mm_ss).toJson();
    }
}
