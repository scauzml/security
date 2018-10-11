package com.boot.service;

import com.boot.domain.User;

/**
 * @author 张明亮
 * @date 2018/10/9 15:17
 */
public interface UserService {
    User selectUserById(Integer userId);
}
