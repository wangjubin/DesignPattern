package com.botech.designpattern.proxy.service;

import com.botech.designpattern.proxy.bean.UserVo;

public interface IUserController {
    UserVo login(String telephone, String password);
    UserVo register(String telephone, String password);
}