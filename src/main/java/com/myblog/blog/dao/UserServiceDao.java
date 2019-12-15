package com.myblog.blog.dao;

import com.myblog.blog.entry.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 大天狗
 */
@Mapper
public interface UserServiceDao {
    /**
     * 插入用户对象到表中
     * @param user 用户对象
     */
    void insertUser(User user);

    /**
     * 通过用户名返回用户对象
     * @param username 用户名
     * @return User
     */
    User selectFromName(String username);

    /**
     * 通过邮箱返回用户对象
     * @param email 用户邮箱
     * @return User
     */
    User selectFromEmail(String email);

    /**
     * 通过邮箱返回用户对象
     * @param user 用户
     */
    void updateUser(User user);
}
