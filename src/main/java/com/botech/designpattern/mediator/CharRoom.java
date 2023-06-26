package com.botech.designpattern.mediator;

import java.util.Date;

/**
 * 公共聊天室
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class CharRoom{
    public static void showMessage(User user,String message){
        System.out.println(new Date() + " [" + user.getName() + "] : " + message);
    }
}