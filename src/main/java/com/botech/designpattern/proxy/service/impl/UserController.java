package com.botech.designpattern.proxy.service.impl;

import com.botech.designpattern.proxy.bean.UserVo;
import com.botech.designpattern.proxy.service.IUserController;

/**
 * 用户控制器
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class UserController implements IUserController {
    //...省略其他属性和方法...


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