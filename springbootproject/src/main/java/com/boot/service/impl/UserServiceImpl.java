package com.boot.service.impl;


import com.boot.dao.UserDao;
import com.boot.domain.User;
import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.xml.ws.WebServiceException;

/**
 * @author 张明亮
 * @date 2018/10/9 15:17
 */
@Service("userService")
public class UserServiceImpl implements UserService {

     @Autowired
     private UserDao userDao;
    @Transactional(rollbackFor = RuntimeException.class,
    noRollbackFor = WebServiceException.class)
    @Override
    public User selectUserById(Integer userId) {

        return userDao.selectUserById(userId);
    }
}
