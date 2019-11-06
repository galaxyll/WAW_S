package com.myblog.blog.entry.somemodel.mapper;

import com.myblog.blog.entry.somemodel.UserTable;

public interface UserTableMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(UserTable record);

    int insertSelective(UserTable record);

    UserTable selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UserTable record);

    int updateByPrimaryKey(UserTable record);
}