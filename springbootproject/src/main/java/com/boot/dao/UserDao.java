package com.boot.dao;

import com.boot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author 张明亮
 * @date 2018/10/9 15:15
 */
@Mapper
public interface UserDao {

     User selectUserById(int userId);
}
