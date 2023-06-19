package com.botech.designpattern.proxy.service.impl;

import com.botech.designpattern.proxy.MetricsCollector;
import com.botech.designpattern.proxy.bean.UserVo;
import com.botech.designpattern.proxy.service.IUserController;

public class UserController implements IUserController {
    //...省略其他属性和方法...
    private MetricsCollector metricsCollector; // 依赖注入

    @Override
    public UserVo login(String telephone, String password) {
        // ...省略login逻辑...
        //...返回UserVo数据...
        return new UserVo();
    }

    @Override
    public UserVo register(String telephone, String password) {
        // ...省略register逻辑...
        //...返回UserVo数据...
        return new UserVo();
    }
}