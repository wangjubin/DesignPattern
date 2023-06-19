package com.botech.designpattern.proxy.service;

import com.botech.designpattern.proxy.bean.UserVo;

/**
 * 用户控制器
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public interface IUserController {
    UserVo login(String telephone, String password);
    UserVo register(String telephone, String password);
}