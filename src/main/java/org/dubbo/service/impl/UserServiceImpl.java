package org.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.dubbo.pojo.User;
import org.dubbo.service.UserSerrvice;


public class UserServiceImpl implements UserSerrvice {

    public void add() {
        System.out.println("执行了新增方法");
    }
}
