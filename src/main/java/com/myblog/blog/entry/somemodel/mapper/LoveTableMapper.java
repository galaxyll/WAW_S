package com.myblog.blog.entry.somemodel.mapper;

import com.myblog.blog.entry.somemodel.LoveTable;

public interface LoveTableMapper {
    int insert(LoveTable record);

    int insertSelective(LoveTable record);
}