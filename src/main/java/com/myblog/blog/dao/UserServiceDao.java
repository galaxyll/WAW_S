package com.myblog.blog.dao;

import com.myblog.blog.entry.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserServiceDao {
    void insert_user(User user);

    User select_from_name(String username);

    User select_from_email(String email);
}
