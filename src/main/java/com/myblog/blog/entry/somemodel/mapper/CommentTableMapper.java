package com.myblog.blog.entry.somemodel.mapper;

import com.myblog.blog.entry.somemodel.CommentTable;

public interface CommentTableMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(CommentTable record);

    int insertSelective(CommentTable record);

    CommentTable selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(CommentTable record);

    int updateByPrimaryKey(CommentTable record);
}